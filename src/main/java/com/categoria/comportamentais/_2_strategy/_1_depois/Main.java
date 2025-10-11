package com.categoria.comportamentais._2_strategy._1_depois;


import com.categoria.comportamentais._2_strategy._1_depois.service.Frete;
import com.categoria.comportamentais._2_strategy._1_depois.service.TipoFrete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Informe a distância: ");
            int distancia = entrada.nextInt();
            System.out.print("Qual o tipo de frete (1) Normal, (2) Sedex: ");

//          Opção 1:
//          int opcaoFrete = entrada.nextInt();
//          TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];
            
//          Opção 2:
            String opcaoFrete = entrada.next();
            TipoFrete tipoFrete = TipoFrete.valueOf(opcaoFrete.toUpperCase());

            Frete frete = tipoFrete.obterFrete();
            double preco = frete.calcularPreco(distancia);
            System.out.printf("O valor total é de R$%.2f", preco);
        }
    }

}
