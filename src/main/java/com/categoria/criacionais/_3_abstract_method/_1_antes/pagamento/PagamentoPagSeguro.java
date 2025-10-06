package com.categoria.criacionais._3_abstract_method._1_antes.pagamento;

import com.categoria.criacionais._3_abstract_method._1_antes.exceptions.AlertaDeRiscoException;
import com.categoria.criacionais._3_abstract_method._1_antes.exceptions.CapturaNaoAutorizadaException;
import com.categoria.criacionais._3_abstract_method._1_antes.gestorDeRisco.FControl;
import com.categoria.criacionais._3_abstract_method._1_antes.operadora.Cielo;

import java.math.BigDecimal;

public class PagamentoPagSeguro {

    private Cielo operadora;
    private FControl gestorDeRisco;

    public PagamentoPagSeguro(Cielo operadora, FControl gestorDeRisco) {
        this.operadora = operadora;
        this.gestorDeRisco = gestorDeRisco;
    }

    public Long autorizar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException, AlertaDeRiscoException {

        this.operadora.capturar(cartao, valor);
        this.gestorDeRisco.avaliarRisco(cartao, valor);

        return this.operadora.confirmar();
    }
}
