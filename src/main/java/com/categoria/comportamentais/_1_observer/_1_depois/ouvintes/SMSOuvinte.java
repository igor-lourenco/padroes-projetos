package com.categoria.comportamentais._1_observer._1_depois.ouvintes;

import com.categoria.comportamentais._1_observer._1_depois.model.Lancamento;
import com.categoria.comportamentais._1_observer._1_depois.notificador.Notificador;

import java.util.List;

public class SMSOuvinte implements Ouvinte {

    private Notificador notificador;

    public SMSOuvinte(Notificador notificador) {
        this.notificador = notificador;

        System.out.printf("Ouvinte: %s se registrando...%n", this.getClass().getSimpleName());
        notificador.registrarOuvinte(this);
    }

    @Override
    public void atualizar(List<Lancamento> lancamentosVencidos) {
        System.out.println("=================================");

        for (Lancamento lancamento : lancamentosVencidos) {
            System.out.println("Enviando SMS para " + lancamento.getPessoa().getTelefone());
        }


//        this.notificador.removerOuvinte(this); // caso queira remover este ouvinte do notificador
    }

}
