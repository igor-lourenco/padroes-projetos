package com.categoria.criacionais._1_factory_method._1_depois.repository;

import com.categoria.criacionais._1_factory_method._1_depois.contato.Contato;
import com.opencsv.CSVReader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ContatosCSV implements Contatos{

    private String nomeArquivo;

    public ContatosCSV(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public List<Contato> todos() {
        List<Contato> contatos = new ArrayList<>();

        try (InputStream in = getClass().getClassLoader().getResourceAsStream(nomeArquivo);
             CSVReader csvReader = new CSVReader(new InputStreamReader(in))) {

            csvReader.forEach(linha -> contatos.add(new Contato(linha[0].trim(), linha[1].trim())));
            return contatos;

        } catch (NullPointerException e) {
            System.out.println("Recurso csv não encontrado: " + e.getMessage());
            throw new RuntimeException("Recurso csv não encontrado", e);
        } catch (Exception e) {
            System.out.println("Erro lendo arquivo csv: " + e.getMessage());
            throw new RuntimeException("Erro lendo arquivo csv", e);
        }
    }
}
