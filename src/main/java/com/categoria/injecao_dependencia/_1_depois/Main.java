package com.categoria.injecao_dependencia._1_depois;

import com.categoria.injecao_dependencia._1_depois.modelo.PedidoVenda;
import com.categoria.injecao_dependencia._1_depois.repositorio.PedidoVendas;
import com.categoria.injecao_dependencia._1_depois.repositorio.XMLPedidoVendasRepository;
import com.categoria.injecao_dependencia._1_depois.servicos.CalculadoraImpostos;
import com.categoria.injecao_dependencia._1_depois.servicos.PedidoVendaService;
import com.categoria.injecao_dependencia._1_depois.servicos.impl.CalculadoraImpostosImpl;
import com.categoria.injecao_dependencia._1_depois.servicos.impl.PedidoVendaServiceImpl;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        PedidoVendas pedidoVendas = new XMLPedidoVendasRepository();
        CalculadoraImpostos calculadoraImpostos = new CalculadoraImpostosImpl();

        PedidoVendaService service = new PedidoVendaServiceImpl(pedidoVendas, calculadoraImpostos);
        PedidoVenda pedidoVenda = new PedidoVenda("sabonete", new BigDecimal("3.00"));

        service.salvar(pedidoVenda);
    }
}
