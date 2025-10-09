package com.categoria.injecao_dependencia._1_antes.servicos.impl;

import com.categoria.injecao_dependencia._1_antes.modelo.PedidoVenda;
import com.categoria.injecao_dependencia._1_antes.repositorio.PedidoVendas;
import com.categoria.injecao_dependencia._1_antes.repositorio.XMLPedidoVendasRepository;
import com.categoria.injecao_dependencia._1_antes.servicos.CalculadoraImpostos;
import com.categoria.injecao_dependencia._1_antes.servicos.PedidoVendaService;

import java.math.BigDecimal;
import java.util.Date;

public class PedidoVendaServiceImpl implements PedidoVendaService {

    private PedidoVendas pedidoVendas;
    private CalculadoraImpostos calculadoraImpostos;


    public PedidoVendaServiceImpl() {
        this.pedidoVendas = new XMLPedidoVendasRepository();
        this.calculadoraImpostos = new CalculadoraImpostosImpl();
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
