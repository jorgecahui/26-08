package com.example.ms_pedido.service;

import com.example.ms_pedido.entity.Pedido;

import java.util.List;
import java.util.Optional;

public interface PedidoService {

    List<Pedido> listar();

    Optional<Pedido> buscarPorId(Integer id);

    Pedido guardar(Pedido pedido);

    Pedido actualizar(Pedido pedido);

    void eliminar(Integer id);
}
