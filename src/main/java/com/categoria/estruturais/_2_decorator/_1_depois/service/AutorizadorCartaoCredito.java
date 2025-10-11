package com.categoria.estruturais._2_decorator._1_depois.service;

import com.categoria.estruturais._2_decorator._1_depois.modelo.CartaoCredito;
import com.categoria.estruturais._2_decorator._1_depois.modelo.Cliente;

public interface AutorizadorCartaoCredito {

    void autorizar(Cliente cliente, CartaoCredito cartaoCredito, double valor);
}
