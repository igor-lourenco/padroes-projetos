package com.categoria.estruturais._1_proxy._1_depois.contatos;

import com.categoria.estruturais._1_proxy._1_depois.modelo.Contato;
import com.categoria.estruturais._1_proxy._1_depois.repository.Contatos;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContatosXML implements Contatos {

    private Map<String, String> contatosEmCache = new HashMap<>();

    @SuppressWarnings("unchecked")
    public ContatosXML(String... nomesArquivos) {
        XStream xstream = new XStream(new StaxDriver());

        xstream.allowTypes(new Class[]{Contato.class});

        xstream.alias("contatos", List.class);
        xstream.alias("contato", Contato.class);

        for (String nomeArquivo : nomesArquivos) {
            System.out.println("Carregando arquivo: " + nomeArquivo);
            List<Contato> contatosCarregados = (List<Contato>) xstream.fromXML(this.getClass().getResource("/" + nomeArquivo));
            for (Contato contato : contatosCarregados) {
                contatosEmCache.put(contato.getEmail(), contato.getNome());
            }
        }
    }

    @Override
    public String buscarPor(String email) {
        return contatosEmCache.get(email);
    }

}