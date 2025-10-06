package com.categoria.criacionais._3_abstract_method._1_depois.operadora;

import com.categoria.criacionais._3_abstract_method._1_antes.exceptions.CapturaNaoAutorizadaException;

import java.math.BigDecimal;

public interface Operadora {

    void capturar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException;

    Long confirmar();
}
