package com.categoria.comportamentais._1_observer._2_depois.notificador;

import com.categoria.comportamentais._1_observer._2_depois.model.Lancamento;
import com.categoria.comportamentais._1_observer._2_depois.ouvintes.Ouvinte;

import java.util.List;

public interface Notificador {

    void registrarOuvinte(Ouvinte ouvinte);

    void removerOuvinte(Ouvinte ouvinte);

    void notificarOuvintes();

    void novosLancamentosVencidos(List<Lancamento> lancamentosVencidos);

    List<Lancamento> getLancamentosVencidos();

}
