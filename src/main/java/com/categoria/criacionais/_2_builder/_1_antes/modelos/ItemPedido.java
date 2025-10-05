package com.categoria.criacionais._2_builder._1_antes.modelos;

import java.math.BigDecimal;

public class ItemPedido {

    private String nome;
    private Integer quantidade;
    private BigDecimal valorUnitario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemPedido{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", quantidade=").append(quantidade);
        sb.append(", valorUnitario=").append(valorUnitario);
        sb.append('}');
        return sb.toString();
    }
}