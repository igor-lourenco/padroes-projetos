package com.categoria.criacionais._2_builder._1_depois;


import com.categoria.criacionais._2_builder._1_depois.modelos.PedidoVenda;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        PedidoVenda pedidoVenda = new PedidoVendaBuilder()
            .comClienteVip("João", true)
            .comItem("Calculadora", 2, "200")
            .comItem("Mochila", 1, "200")
            .construir();

        
        BigDecimal valorTotal = pedidoVenda.getValorTotal();

        System.out.println("\n" + pedidoVenda);
        System.out.println("Valor Total: " + valorTotal);
    }
}
