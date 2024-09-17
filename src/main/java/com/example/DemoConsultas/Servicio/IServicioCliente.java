package com.example.DemoConsultas.Servicio;

import com.example.DemoConsultas.modelo.CiudadPais;
import com.example.DemoConsultas.modelo.Cliente;

import java.util.List;

public interface IServicioCliente {
    List<Cliente> consultarTodos();
    Cliente consultarUno(String idCliente);
    Cliente insertar(Cliente cliente);
    Cliente modificar(Cliente cliente);
    void eliminar(String idCliente);
    List<Cliente> consultaPorCiudad(String ciudad);
    List<Cliente> consultaPorCiudadYPais(String ciudad, String pais);

    List<Cliente> consulta3PrimerosEmpresaLike(String patron);

    List<CiudadPais> consultaDistintasCiudadesPais(String pais);

    List<Cliente> consultaOrdenadoDescendente();

    List<Cliente> consultaPorPais(List<String> paises);


}
