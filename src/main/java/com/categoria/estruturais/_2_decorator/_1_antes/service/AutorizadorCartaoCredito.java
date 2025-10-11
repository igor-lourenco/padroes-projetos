package com.categoria.estruturais._2_decorator._1_antes.service;

import com.categoria.estruturais._2_decorator._1_antes.modelo.CartaoCredito;
import com.categoria.estruturais._2_decorator._1_antes.modelo.Cliente;

public interface AutorizadorCartaoCredito {

    void autorizar(Cliente cliente, CartaoCredito cartaoCredito, double valor);
}
