package com.categoria.comportamentais._1_observer._2_depois.model;

public enum TipoLancamento {

    DESPESA("Despesa"),
    RECEITA("Receita");

    private String descricao;

    TipoLancamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
