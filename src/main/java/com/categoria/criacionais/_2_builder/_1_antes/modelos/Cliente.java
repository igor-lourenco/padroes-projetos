package com.categoria.criacionais._2_builder._1_antes.modelos;

public class Cliente {

    private String nome;
    private boolean vip;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", vip=").append(vip);
        sb.append('}');
        return sb.toString();
    }
}