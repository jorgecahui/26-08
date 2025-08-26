package com.example.ms_pedido.service.impl;

import com.example.ms_pedido.entity.Pedido;
import com.example.ms_pedido.repository.PedidoRepository;
import com.example.ms_pedido.service.PedidoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServiceImpl implements PedidoService {

    private final PedidoRepository repository;

    public PedidoServiceImpl(PedidoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Pedido> listar() {
        return repository.findAll();
    }

    @Override
    public Optional<Pedido> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Pedido guardar(Pedido pedido) {
        return repository.save(pedido);
    }

    @Override
    public Pedido actualizar(Pedido pedido) {
        return repository.save(pedido);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}