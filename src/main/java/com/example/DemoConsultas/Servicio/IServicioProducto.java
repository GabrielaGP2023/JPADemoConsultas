package com.example.DemoConsultas.Servicio;

import com.example.DemoConsultas.modelo.Producto;

import java.util.List;

public interface IServicioProducto {
    List<Producto> consultarTodos();
    Producto consultarUno(Short idProducto);
    Producto insertar(Producto Producto);
    Producto modificar(Producto Producto);
    void eliminar(Short idProducto);
    List<Producto> findBycategoryId(short categoryId);
    List<Producto> findByNombreProductoStartingWith(String letra);
    List<Producto> findOrderByNombreProducto();
    List<Producto> findByUnitPriceGreaterThan(double unitPrice);


}
