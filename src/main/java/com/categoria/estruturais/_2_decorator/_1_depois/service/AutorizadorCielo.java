package com.categoria.estruturais._2_decorator._1_depois.service;

import com.categoria.estruturais._2_decorator._1_depois.modelo.CartaoCredito;
import com.categoria.estruturais._2_decorator._1_depois.modelo.Cliente;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class AutorizadorCielo implements AutorizadorCartaoCredito {


    @Override
    public void autorizar(Cliente cliente, CartaoCredito cartaoCredito, double valor) {

        try (PrintStream writer = new PrintStream(new FileOutputStream("debitos.txt", true))) {
            writer.println(cliente + ", " + cartaoCredito + ", R$ " + valor);

            System.out.println("Arquivo debitos.txt escrito...");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
