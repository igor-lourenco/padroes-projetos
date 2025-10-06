package com.categoria.criacionais._3_abstract_method._1_depois.pagamento.factory;


import com.categoria.criacionais._3_abstract_method._1_depois.gestorDeRisco.FControl;
import com.categoria.criacionais._3_abstract_method._1_depois.gestorDeRisco.GestorDeRisco;
import com.categoria.criacionais._3_abstract_method._1_depois.operadora.Cielo;
import com.categoria.criacionais._3_abstract_method._1_depois.operadora.Operadora;

public class PagSeguroFactory implements PagamentoFactory {


    @Override
    public Operadora criarOperadora() {
        return new Cielo();
    }

    @Override
    public GestorDeRisco criarGestorDeRisco() {
        return new FControl();
    }
}
