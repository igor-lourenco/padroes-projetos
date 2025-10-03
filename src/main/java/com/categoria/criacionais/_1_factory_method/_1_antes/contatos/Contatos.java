package com.categoria.criacionais._1_factory_method._1_antes.contatos;

import com.opencsv.CSVReader;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Contatos {

    public List<Contato> recuperarContatosCSV(String nomeArquivo) {
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


    @SuppressWarnings("unchecked")
    public List<Contato> recuperarContatosXML(String nomeArquivo) {
        XStream xstream = new XStream(new StaxDriver());

        xstream.allowTypes(new Class[]{Contato.class});// Libere as classes necessárias (recomendado)

        xstream.alias("contatos", List.class);
        xstream.alias("contato", Contato.class);

        URL recurso = getClass().getResource("/" + nomeArquivo);
        if (recurso == null) throw new IllegalArgumentException("Recurso não encontrado no classpath: " + nomeArquivo);

        try (InputStream in = recurso.openStream()) {
            return (List<Contato>) xstream.fromXML(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
