package com.categoria.estruturais._1_decorator._1_depois.service;

import com.categoria.estruturais._1_decorator._1_depois.exceptions.RiscoCreditoException;
import com.categoria.estruturais._1_decorator._1_depois.modelo.CartaoCredito;
import com.categoria.estruturais._1_decorator._1_depois.modelo.Cliente;

import java.time.YearMonth;

public class AnalisadorDeRisco implements AutorizadorCartaoCredito {

    private AutorizadorCartaoCredito autorizadorCartaoCredito;

    public AnalisadorDeRisco(AutorizadorCartaoCredito autorizadorCartaoCredito) {
        this.autorizadorCartaoCredito = autorizadorCartaoCredito;
    }

    @Override
    public void autorizar(Cliente cliente, CartaoCredito cartaoCredito, double valor) {

        //Poderia adicionar funcionalidades antes

        if (cliente.getCpf().startsWith("111")
            || cartaoCredito.getVencimento().isBefore(YearMonth.now())
            || valor > 500) {
            throw new RiscoCreditoException("Possível fraude, negando pagamento!");
        }

        autorizadorCartaoCredito.autorizar(cliente, cartaoCredito, valor);

        //Poderia adicionar funcionalidades depois
    }
}
