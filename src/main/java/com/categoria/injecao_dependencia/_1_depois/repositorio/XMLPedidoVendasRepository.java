package com.categoria.injecao_dependencia._1_depois.repositorio;

import com.categoria.injecao_dependencia._1_depois.modelo.PedidoVenda;
import com.thoughtworks.xstream.XStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class XMLPedidoVendasRepository implements PedidoVendas {


    @Override
    public void salvar(PedidoVenda pedidoVenda) {

        XStream xStream = new XStream();

        xStream.alias("pedido-venda", PedidoVenda.class);

        OutputStream output = null;

        try {
            output = new FileOutputStream(pedidoVenda.getDescricao() + ".xml");
            xStream.toXML(pedidoVenda, output);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Erro ao salvar arquivo: " + e.getMessage());
        }
    }
}
