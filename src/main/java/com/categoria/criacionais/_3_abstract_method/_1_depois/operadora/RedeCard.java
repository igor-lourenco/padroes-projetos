package com.categoria.criacionais._3_abstract_method._1_depois.operadora;

import com.categoria.criacionais._3_abstract_method._1_antes.exceptions.CapturaNaoAutorizadaException;

import java.math.BigDecimal;

public class RedeCard implements Operadora {

    private Long codigoConfirmacao = -1L;

    @Override
    public void capturar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException {

        if (cartao.startsWith("3333") && valorMaiorQueLimite(valor)) {
            throw new CapturaNaoAutorizadaException("Valor maior que limite para cartão informado: " + cartao);
        }

        this.codigoConfirmacao = (long) (Math.random() * 1000);
    }

    private boolean valorMaiorQueLimite(BigDecimal valor) {
        BigDecimal limite = new BigDecimal("1000");
        return valor.compareTo(limite) > 0;
    }

    @Override
    public Long confirmar() {
        System.out.println("Fazendo débito na conta do cliente via RedeCard");
        return this.codigoConfirmacao;
    }
}
