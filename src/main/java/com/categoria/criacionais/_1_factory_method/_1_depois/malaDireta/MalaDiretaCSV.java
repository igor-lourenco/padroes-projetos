package com.categoria.criacionais._1_factory_method._1_depois.malaDireta;

import com.categoria.criacionais._1_factory_method._1_depois.repository.Contatos;
import com.categoria.criacionais._1_factory_method._1_depois.repository.ContatosCSV;

public class MalaDiretaCSV extends MalaDireta{

    private String nomeArquivo;


    public MalaDiretaCSV(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    protected Contatos criarContatos() {
        return new ContatosCSV(nomeArquivo);
    }
}
