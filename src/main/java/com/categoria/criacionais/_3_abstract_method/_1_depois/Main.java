package com.categoria.criacionais._3_abstract_method._1_depois;

import com.categoria.criacionais._3_abstract_method._1_depois.pagamento.Pagamento;
import com.categoria.criacionais._3_abstract_method._1_depois.pagamento.factory.PagSeguroFactory;
import com.categoria.criacionais._3_abstract_method._1_depois.pagamento.factory.PayPalFactory;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        System.out.println();

        Pagamento pagamento = new Pagamento(new PagSeguroFactory());

        Long codigoAutorizacao1 = pagamento.autorizar("2222.2222", new BigDecimal("200"));

//        Long codigoAutorizacao1 = pagamento.autorizar("5555.2222", new BigDecimal("200")); // CapturaNaoAutorizadaException
//        Long codigoAutorizacao1 = pagamento.autorizar("7777.2222", new BigDecimal("5500")); // AlertaDeRiscoException

        System.out.println("Codigo de autorizacao 1: " + codigoAutorizacao1);

        System.out.println("============================================");


        pagamento = new Pagamento(new PayPalFactory());

        Long codigoAutorizacao2 = pagamento.autorizar("2222.2222", new BigDecimal("200"));

//        Long codigoAutorizacao2 = pagamento.autorizar("3333.2222", new BigDecimal("2000")); // CapturaNaoAutorizadaException
//        Long codigoAutorizacao2 = pagamento.autorizar("1111.2222", new BigDecimal("5500")); // AlertaDeRiscoException

        System.out.println("Codigo de autorizacao 2: " + codigoAutorizacao2);
    }
}
