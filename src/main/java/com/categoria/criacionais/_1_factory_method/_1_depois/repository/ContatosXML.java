package com.categoria.criacionais._1_factory_method._1_depois.repository;

import com.categoria.criacionais._1_factory_method._1_depois.contato.Contato;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.net.URL;
import java.util.List;

public class ContatosXML implements Contatos {

    private String nomeArquivo;

    public ContatosXML(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public List<Contato> todos() {
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
