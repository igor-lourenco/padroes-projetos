package com.categoria.criacionais._3_abstract_method._1_depois.pagamento;


import com.categoria.criacionais._3_abstract_method._1_depois.exceptions.AlertaDeRiscoException;
import com.categoria.criacionais._3_abstract_method._1_depois.exceptions.CapturaNaoAutorizadaException;
import com.categoria.criacionais._3_abstract_method._1_depois.gestorDeRisco.GestorDeRisco;
import com.categoria.criacionais._3_abstract_method._1_depois.operadora.Operadora;
import com.categoria.criacionais._3_abstract_method._1_depois.pagamento.factory.PagamentoFactory;

import java.math.BigDecimal;

public class Pagamento {

    private Operadora operadora;
    private GestorDeRisco gestorDeRisco;

    public Pagamento(PagamentoFactory pagamentoFactory) {
        this.operadora = pagamentoFactory.criarOperadora();
        this.gestorDeRisco = pagamentoFactory.criarGestorDeRisco();
    }

    public Long autorizar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException, AlertaDeRiscoException {

        this.operadora.capturar(cartao, valor);
        this.gestorDeRisco.avaliarRisco(cartao, valor);

        return this.operadora.confirmar();
    }
}
