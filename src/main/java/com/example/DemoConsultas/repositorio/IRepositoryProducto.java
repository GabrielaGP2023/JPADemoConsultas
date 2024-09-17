package com.example.DemoConsultas.repositorio;

import com.example.DemoConsultas.modelo.CiudadPais;
import com.example.DemoConsultas.modelo.Cliente;
import com.example.DemoConsultas.modelo.Producto;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IRepositoryProducto extends JpaRepository<Producto, Short> {
//    Obtener los productos cuya categoría sea 2
    List<Producto> findByCategoryId(short categoryId);

//    Obtener los productos que comiencen con N
    List<Producto> findByNombreProductoStartingWith(String letra);

//    Ordenar los productos de forma ascendente por nombre de producto
    List<Producto> findByOrderByNombreProducto();

//    Obtener los productos cuyo precio es mayor a 20
    List<Producto> findByUnitPriceGreaterThan(double unitPrice);

}
