package com.categoria.criacionais._2_builder._1_antes;

import com.categoria.criacionais._2_builder._1_antes.modelos.Cliente;
import com.categoria.criacionais._2_builder._1_antes.modelos.ItemPedido;
import com.categoria.criacionais._2_builder._1_antes.modelos.PedidoVenda;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        PedidoVenda pedidoVenda = new PedidoVenda();

        Cliente cliente = new Cliente();
        cliente.setNome("João");
        cliente.setVip(true);
        pedidoVenda.setCliente(cliente);

        ItemPedido item1 = new ItemPedido();
        item1.setNome("Calculadora");
        item1.setValorUnitario(new BigDecimal("200"));
        item1.setQuantidade(2);

        ItemPedido item2 = new ItemPedido();
        item2.setNome("Mochila");
        item2.setValorUnitario(new BigDecimal("200"));
        item2.setQuantidade(1);

        List<ItemPedido> itensPedido = Arrays.asList(item1, item2);
        pedidoVenda.setItensPedido(itensPedido);

        BigDecimal valorTotal = pedidoVenda.getValorTotal();

        System.out.println("\n" + pedidoVenda);
        System.out.println("Valor Total: " + valorTotal);

    }
}
