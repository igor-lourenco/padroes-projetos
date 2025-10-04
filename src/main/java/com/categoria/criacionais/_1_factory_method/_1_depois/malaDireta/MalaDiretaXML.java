package com.categoria.criacionais._1_factory_method._1_depois.malaDireta;

import com.categoria.criacionais._1_factory_method._1_depois.repository.Contatos;
import com.categoria.criacionais._1_factory_method._1_depois.repository.ContatosXML;

public class MalaDiretaXML extends MalaDireta {

    private String nomeContatos;

    public MalaDiretaXML(String nomeContatos) {
        this.nomeContatos = nomeContatos;
    }

    @Override
    protected Contatos criarContatos() {
        return new ContatosXML(nomeContatos);
    }
}
