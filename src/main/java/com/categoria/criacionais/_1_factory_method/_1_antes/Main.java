package com.categoria.criacionais._1_factory_method._1_antes;

import com.categoria.criacionais._1_factory_method._1_antes.malaDireta.MalaDireta;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        MalaDireta malaDireta = new MalaDireta();
        String mensagem = JOptionPane.showInputDialog(null, "Informe a mensagem para o email");

        boolean status = malaDireta.enviarEmail("contatos.csv", mensagem);
//        boolean status = malaDireta.enviarEmail("contatos.xml", mensagem);
        System.out.println(status);
    }
}
