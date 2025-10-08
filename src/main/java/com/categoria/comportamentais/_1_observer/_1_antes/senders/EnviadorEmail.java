package com.categoria.comportamentais._1_observer._1_antes.senders;

import com.categoria.comportamentais._1_observer._1_antes.model.Lancamento;

import java.util.List;

public class EnviadorEmail {

    public void enviar(List<Lancamento> lancamentosVencidos) {
        System.out.println("=================================");

        for (Lancamento lancamento : lancamentosVencidos) {
            System.out.println("Enviando e-mail para " + lancamento.getPessoa().getEmail());
        }
    }
}

