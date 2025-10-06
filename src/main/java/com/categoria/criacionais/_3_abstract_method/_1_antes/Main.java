package com.categoria.criacionais._3_abstract_method._1_antes;

import com.categoria.criacionais._3_abstract_method._1_antes.gestorDeRisco.FControl;
import com.categoria.criacionais._3_abstract_method._1_antes.operadora.Cielo;
import com.categoria.criacionais._3_abstract_method._1_antes.pagamento.PagamentoPagSeguro;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Cielo cielo = new Cielo();
        FControl fControl = new FControl();
        PagamentoPagSeguro pagamento = new PagamentoPagSeguro(cielo, fControl);

        Long codigoAutorizacao = pagamento.autorizar("2222.2222", new BigDecimal("200"));

//        Long codigoAutorizacao = pagamento.autorizar("5555.2222", new BigDecimal("200")); // CapturaNaoAutorizadaException
//        Long codigoAutorizacao = pagamento.autorizar("7777.2222", new BigDecimal("5500")); // AlertaDeRiscoException

        System.out.println("\nCodigo de autorizacao: " + codigoAutorizacao);

    }
}
