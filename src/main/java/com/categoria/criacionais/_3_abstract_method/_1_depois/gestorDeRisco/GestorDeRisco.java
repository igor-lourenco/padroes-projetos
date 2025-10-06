package com.categoria.criacionais._3_abstract_method._1_depois.gestorDeRisco;

import com.categoria.criacionais._3_abstract_method._1_antes.exceptions.AlertaDeRiscoException;

import java.math.BigDecimal;

public interface GestorDeRisco {

    void avaliarRisco(String cartao, BigDecimal valor) throws AlertaDeRiscoException;
}
