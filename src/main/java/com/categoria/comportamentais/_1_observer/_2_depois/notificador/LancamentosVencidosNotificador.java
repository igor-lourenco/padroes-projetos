package com.categoria.comportamentais._1_observer._2_depois.notificador;

import com.categoria.comportamentais._1_observer._2_depois.model.Lancamento;
import com.categoria.comportamentais._1_observer._2_depois.ouvintes.Ouvinte;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LancamentosVencidosNotificador implements Notificador {

    private Set<Ouvinte> ouvintes;
    private List<Lancamento> lancamentosVencidos;

    public LancamentosVencidosNotificador() {
        this.ouvintes = new HashSet<>();
    }

    @Override
    public void registrarOuvinte(Ouvinte ouvinte) {
        System.out.println("Registrando Ouvinte: " + ouvinte.getClass().getSimpleName());
        this.ouvintes.add(ouvinte);
    }

    @Override
    public void removerOuvinte(Ouvinte ouvinte) {
        System.out.println("Removendo Ouvinte: " + ouvinte.getClass().getSimpleName());
        this.ouvintes.remove(ouvinte);
    }

    @Override
    public void notificarOuvintes() {
        System.out.println("Notificando Ouvintes: " + ouvintes.size());
        ouvintes.forEach(Ouvinte::atualizar);
    }

    @Override
    public void novosLancamentosVencidos(List<Lancamento> lancamentosVencidos) {
        System.out.println("Adicionando novos lançamentos vencidos: " + lancamentosVencidos.size());
        this.lancamentosVencidos = lancamentosVencidos;
        this.notificarOuvintes();
    }

    @Override
    public List<Lancamento> getLancamentosVencidos() {
        return this.lancamentosVencidos;
    }
}
