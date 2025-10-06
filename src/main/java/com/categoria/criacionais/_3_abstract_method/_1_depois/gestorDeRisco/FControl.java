package com.categoria.criacionais._3_abstract_method._1_depois.gestorDeRisco;

import com.categoria.criacionais._3_abstract_method._1_depois.exceptions.AlertaDeRiscoException;

import java.math.BigDecimal;

public class FControl implements GestorDeRisco {

    @Override
    public void avaliarRisco(String cartao, BigDecimal valor) throws AlertaDeRiscoException {
        if (cartao.startsWith("7777")) {
            throw new AlertaDeRiscoException("Cartão suspeito: " + cartao);
        }
    }
}
