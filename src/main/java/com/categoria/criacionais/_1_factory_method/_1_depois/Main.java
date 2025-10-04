package com.categoria.criacionais._1_factory_method._1_depois;


import com.categoria.criacionais._1_factory_method._1_depois.malaDireta.MalaDireta;
import com.categoria.criacionais._1_factory_method._1_depois.malaDireta.MalaDiretaCSV;
import com.categoria.criacionais._1_factory_method._1_depois.malaDireta.MalaDiretaXML;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

//        MalaDireta malaDireta = new MalaDiretaCSV("contatos.csv");
        MalaDireta malaDireta = new MalaDiretaXML("contatos.xml");

        String mensagem = JOptionPane.showInputDialog(null, "Informe a mensagem para o email");

        boolean status = malaDireta.enviarEmail(mensagem);

        System.out.println(status);
        JOptionPane.showMessageDialog(null, "E-mails enviados: " + status);
    }
}
