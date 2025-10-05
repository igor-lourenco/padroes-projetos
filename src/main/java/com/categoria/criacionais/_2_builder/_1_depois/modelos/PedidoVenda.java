package com.categoria.criacionais._2_builder._1_depois.modelos;

import java.math.BigDecimal;
import java.util.List;

public class PedidoVenda {

    private String numero;
    private Cliente cliente;
    private List<ItemPedido> itensPedido;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<ItemPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }

    public BigDecimal getValorTotal() {
        BigDecimal valorTotal = BigDecimal.ZERO;
        for (ItemPedido item : itensPedido) {
            valorTotal = valorTotal.add(item.getValorUnitario().multiply(new BigDecimal(item.getQuantidade())));
        }

        // Se cliente vip dar 4% de desconto
        if (cliente.isVip()) {
            valorTotal = valorTotal.multiply(new BigDecimal("0.96"));
        }

        return valorTotal;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PedidoVenda{");
        sb.append("numero='").append(numero).append('\'');
        sb.append(", cliente=").append(cliente);
        sb.append(", itensPedido=").append(itensPedido);
        sb.append('}');
        return sb.toString();
    }
}
