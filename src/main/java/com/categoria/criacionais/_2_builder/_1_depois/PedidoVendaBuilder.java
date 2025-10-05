package com.categoria.criacionais._2_builder._1_depois;

import com.categoria.criacionais._2_builder._1_depois.modelos.Cliente;
import com.categoria.criacionais._2_builder._1_depois.modelos.ItemPedido;
import com.categoria.criacionais._2_builder._1_depois.modelos.PedidoVenda;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PedidoVendaBuilder {

    private PedidoVenda pedidoVenda;

    public PedidoVendaBuilder() {
        this.pedidoVenda = new PedidoVenda();
    }

    public PedidoVendaBuilder comCliente(String nome) {
        this.pedidoVenda.setCliente(definirCliente(nome, false));
        return this;
    }

    public PedidoVendaBuilder comClienteVip(String nome, boolean isVip) {
        this.pedidoVenda.setCliente(definirCliente(nome, isVip));
        return this;
    }

    public PedidoVendaBuilder comItem(String nome, Integer quantidade, String valorUnitario) {
        ItemPedido item = new ItemPedido(nome, quantidade, new BigDecimal(valorUnitario));

        if (this.pedidoVenda.getItensPedido() == null) {
            this.pedidoVenda.setItensPedido(new ArrayList<>());
        }

        this.pedidoVenda.getItensPedido().add(item);
        return this;
    }

    private Cliente definirCliente(String nome, boolean isVip) {
        return new Cliente(nome, isVip);
    }

    public PedidoVenda construir() {
        return this.pedidoVenda;
    }
}

