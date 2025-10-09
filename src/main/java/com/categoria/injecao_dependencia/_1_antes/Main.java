package com.categoria.injecao_dependencia._1_antes;

import com.categoria.injecao_dependencia._1_antes.modelo.PedidoVenda;
import com.categoria.injecao_dependencia._1_antes.servicos.PedidoVendaService;
import com.categoria.injecao_dependencia._1_antes.servicos.impl.PedidoVendaServiceImpl;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        PedidoVendaService service = new PedidoVendaServiceImpl();
        PedidoVenda pedidoVenda = new PedidoVenda("sabonete", new BigDecimal("3.00"));

        service.salvar(pedidoVenda);
    }
}
