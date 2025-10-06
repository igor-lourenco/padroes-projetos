package com.categoria.criacionais._3_abstract_method._1_depois.pagamento.factory;


import com.categoria.criacionais._3_abstract_method._1_depois.gestorDeRisco.ClearSale;
import com.categoria.criacionais._3_abstract_method._1_depois.gestorDeRisco.GestorDeRisco;
import com.categoria.criacionais._3_abstract_method._1_depois.operadora.Operadora;
import com.categoria.criacionais._3_abstract_method._1_depois.operadora.RedeCard;

public class PayPalFactory implements PagamentoFactory {

    @Override
    public Operadora criarOperadora() {
        return new RedeCard();
    }

    @Override
    public GestorDeRisco criarGestorDeRisco() {
        return new ClearSale();
    }
}
