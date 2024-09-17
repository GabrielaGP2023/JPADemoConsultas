package com.example.DemoConsultas.Servicio;

import com.example.DemoConsultas.modelo.Producto;
import com.example.DemoConsultas.repositorio.IRepositoryProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioProducto implements IServicioProducto{
    @Autowired
    private IRepositoryProducto repoProducto;

    @Override
    public List<Producto> consultarTodos() {
        return repoProducto.findAll();

    }

    @Override
    public Producto consultarUno(Short idProducto) {
        return repoProducto.findById(idProducto).orElse(new Producto());
    }

    @Override
    public Producto insertar(Producto Producto) {
        return repoProducto.save(Producto);
    }

    @Override
    public Producto modificar(Producto Producto) {
        return repoProducto.save(Producto);
    }

    @Override
    public void eliminar(Short idProducto) {
        repoProducto.deleteById(idProducto);
    }

    @Override
    public List<Producto> findBycategoryId(short categoryId) {
        return repoProducto.findByCategoryId(categoryId);
    }

    @Override
    public List<Producto> findByNombreProductoStartingWith(String letra) {
        return repoProducto.findByNombreProductoStartingWith(letra);
    }

    @Override
    public List<Producto> findOrderByNombreProducto() {
        return repoProducto.findByOrderByNombreProducto();
    }

    @Override
    public List<Producto> findByUnitPriceGreaterThan(double unitPrice) {
        return repoProducto.findByUnitPriceGreaterThan(unitPrice);
    }
}
