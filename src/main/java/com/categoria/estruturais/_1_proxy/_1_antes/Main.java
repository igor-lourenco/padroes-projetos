package com.categoria.estruturais._1_proxy._1_antes;

import com.categoria.estruturais._1_proxy._1_antes.contatos.ContatosXML;
import com.categoria.estruturais._1_proxy._1_antes.repository.Contatos;

public class Main {

    public static void main(String[] args) {
        Contatos contatos = new ContatosXML("contatos-proxy-1.xml", "contatos-proxy-2.xml");
        String nome = contatos.buscarPor("jose@email.com");

        System.out.println(nome);
    }
}
