package com.categoria.criacionais._3_abstract_method._1_antes.operadora;

import com.categoria.criacionais._3_abstract_method._1_antes.exceptions.CapturaNaoAutorizadaException;

import java.math.BigDecimal;

public class Cielo {

    private Long codigoConfirmacao = -1L;

    public void capturar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException {

        if (cartao.startsWith("5555")) {
            throw new CapturaNaoAutorizadaException("Número de cartão inválido: " + cartao);
        }

        this.codigoConfirmacao = (long) (Math.random() * 1000);
    }

    public Long confirmar() {
        System.out.println("Fazendo débito na conta do cliente via Cielo");
        return this.codigoConfirmacao;
    }
}
