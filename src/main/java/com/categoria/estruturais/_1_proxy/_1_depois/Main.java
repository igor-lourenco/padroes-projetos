package com.categoria.estruturais._1_proxy._1_depois;


import com.categoria.estruturais._1_proxy._1_depois.contatos.ContatosXMLProxy;
import com.categoria.estruturais._1_proxy._1_depois.repository.Contatos;

public class Main {

    public static void main(String[] args) {
        Contatos contatos = new ContatosXMLProxy("contatos-proxy-1.xml", "contatos-proxy-2.xml");
        String nome = contatos.buscarPor("jose@email.com");

        System.out.println(nome);
    }
}
