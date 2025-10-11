package com.categoria.comportamentais._2_strategy._1_depois.service.frete;

import com.categoria.comportamentais._2_strategy._1_depois.service.Frete;

public class Normal implements Frete {

    @Override
    public double calcularPreco(int distancia) {
        return distancia * 1.25 + 10;
    }
}
