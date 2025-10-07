package com.categoria.estruturais._1_proxy._1_depois.contatos;

import com.categoria.estruturais._1_proxy._1_depois.repository.Contatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ContatosXMLProxy implements Contatos {

    private List<String> nomesArquivos;
    private ContatosXML contatosXML;

    public ContatosXMLProxy(String... nomesArquivos) {
        this.nomesArquivos = new ArrayList<>(Arrays.asList(nomesArquivos));
    }


    @Override
    public String buscarPor(String email) {

        String nome = null;
        Random random = new Random();

        int quantidadeArquivos = nomesArquivos.size();
        for (int i = 0; i < quantidadeArquivos; i++) {
            int indiceParaPesquisa = random.nextInt(nomesArquivos.size());

            String nomeArquivo = nomesArquivos.remove(indiceParaPesquisa);
            this.contatosXML = new ContatosXML(nomeArquivo); // carrega um arquivo por vez...
            nome = this.contatosXML.buscarPor(email);

            if (nome != null) break;
        }

        return nome;
    }
}
