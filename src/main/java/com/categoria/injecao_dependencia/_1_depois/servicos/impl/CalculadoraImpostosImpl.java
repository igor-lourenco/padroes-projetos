package com.categoria.injecao_dependencia._1_depois.servicos.impl;

import com.categoria.injecao_dependencia._1_depois.servicos.CalculadoraImpostos;

import java.math.BigDecimal;

public class CalculadoraImpostosImpl implements CalculadoraImpostos {

    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(new BigDecimal("0.15"));
    }
}
