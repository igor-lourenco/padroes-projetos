package com.categoria.injecao_dependencia._1_depois.servicos.impl;

import com.categoria.injecao_dependencia._1_depois.modelo.PedidoVenda;
import com.categoria.injecao_dependencia._1_depois.repositorio.PedidoVendas;
import com.categoria.injecao_dependencia._1_depois.servicos.CalculadoraImpostos;
import com.categoria.injecao_dependencia._1_depois.servicos.PedidoVendaService;

import java.math.BigDecimal;
import java.util.Date;

public class PedidoVendaServiceImpl implements PedidoVendaService {

    private PedidoVendas pedidoVendas;
    private CalculadoraImpostos calculadoraImpostos;


    public PedidoVendaServiceImpl(PedidoVendas pedidoVendas, CalculadoraImpostos calculadoraImpostos) {
        this.pedidoVendas = pedidoVendas;
        this.calculadoraImpostos = calculadoraImpostos;
    }

    @Override
    public void salvar(PedidoVenda pedidoVenda) {
        pedidoVenda.setData(new Date());

        BigDecimal imposto = calculadoraImpostos.calcular(pedidoVenda.getValor());
        pedidoVenda.setImposto(imposto);

        pedidoVendas.salvar(pedidoVenda);
        System.out.println("Pedido salvo: " + pedidoVenda.getDescricao());
    }
}
