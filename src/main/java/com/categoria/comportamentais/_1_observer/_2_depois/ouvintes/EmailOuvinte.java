package com.categoria.comportamentais._1_observer._2_depois.ouvintes;

import com.categoria.comportamentais._1_observer._2_depois.model.Lancamento;
import com.categoria.comportamentais._1_observer._2_depois.notificador.Notificador;

import java.util.List;

public class EmailOuvinte implements Ouvinte {

    private Notificador notificador;

    public EmailOuvinte(Notificador notificador) {
        this.notificador = notificador;

        System.out.printf("Ouvinte: %s se registrando...%n", this.getClass().getSimpleName());
        notificador.registrarOuvinte(this);
    }

    @Override
    public void atualizar() {
        List<Lancamento> lancamentosVencidos = this.notificador.getLancamentosVencidos();
        System.out.println("=================================");

        for (Lancamento lancamento : lancamentosVencidos) {
            System.out.println("Enviando e-mail para " + lancamento.getPessoa().getEmail());
        }

//        this.notificador.removerOuvinte(this); // caso queira remover este ouvinte do notificador
    }
}

