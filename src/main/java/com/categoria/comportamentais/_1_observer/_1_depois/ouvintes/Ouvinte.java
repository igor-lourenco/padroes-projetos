package com.categoria.comportamentais._1_observer._1_depois.ouvintes;

import com.categoria.comportamentais._1_observer._1_depois.model.Lancamento;

import java.util.List;

public interface Ouvinte {

    void atualizar(List<Lancamento> lancamentosVencidos);
}
