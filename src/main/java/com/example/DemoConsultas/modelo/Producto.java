package com.example.DemoConsultas.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name= "products")
public class Producto {
    @Id
    private Short productId;
    @Column(name = "product_name")
    private String nombreProducto;
    private short categoryId;
    private double unitPrice;
    private short unitsInStock;
    private int discontinued;
}
