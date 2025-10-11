package com.categoria.comportamentais._2_strategy._1_depois.service;

import com.categoria.comportamentais._2_strategy._1_depois.service.frete.Normal;
import com.categoria.comportamentais._2_strategy._1_depois.service.frete.Sedex;

public enum TipoFrete {

    NORMAL {
        @Override
        public Frete obterFrete() {
            return new Normal();
        }
    },
    SEDEX {
        @Override
        public Frete obterFrete() {
            return new Sedex();
        }
    };

    public abstract Frete obterFrete();
}
