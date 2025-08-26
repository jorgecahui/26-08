package com.example.ms_pedido.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descripcion;
    private Double total;
    private Integer productoId;  // relación con ms-producto
}
