package com.categoria.criacionais._3_abstract_method._1_depois.pagamento.factory;

import com.categoria.criacionais._3_abstract_method._1_depois.gestorDeRisco.GestorDeRisco;
import com.categoria.criacionais._3_abstract_method._1_depois.operadora.Operadora;

public interface PagamentoFactory {

    Operadora criarOperadora();

    GestorDeRisco criarGestorDeRisco();
}
