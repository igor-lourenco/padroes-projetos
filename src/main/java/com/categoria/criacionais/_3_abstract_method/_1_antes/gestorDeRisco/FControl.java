package com.categoria.criacionais._3_abstract_method._1_antes.gestorDeRisco;

import com.categoria.criacionais._3_abstract_method._1_antes.exceptions.AlertaDeRiscoException;

import java.math.BigDecimal;

public class FControl {


    public void avaliarRisco(String cartao, BigDecimal valor) throws AlertaDeRiscoException {
        if (cartao.startsWith("7777")) {
            throw new AlertaDeRiscoException("Cartão suspeito: " + cartao);
        }
    }
}
