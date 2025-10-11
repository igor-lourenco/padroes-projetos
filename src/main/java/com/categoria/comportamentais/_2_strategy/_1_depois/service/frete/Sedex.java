package com.categoria.comportamentais._2_strategy._1_depois.service.frete;

import com.categoria.comportamentais._2_strategy._1_depois.service.Frete;

public class Sedex implements Frete {

    @Override
    public double calcularPreco(int distancia) {
        return distancia * 1.45 + 12;
    }
}
