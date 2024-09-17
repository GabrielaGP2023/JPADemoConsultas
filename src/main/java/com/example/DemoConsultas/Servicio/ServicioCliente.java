package com.example.DemoConsultas.Servicio;

import com.example.DemoConsultas.modelo.CiudadPais;
import com.example.DemoConsultas.modelo.Cliente;
import com.example.DemoConsultas.repositorio.IRepositoryCliente;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicioCliente implements IServicioCliente{
    @Autowired
    private IRepositoryCliente repoCliente;

    @Override
    public List<Cliente> consultarTodos() {
        return repoCliente.findAll();
    }

    @Override
    public Cliente consultarUno(String idCliente) {
        return repoCliente.findById(idCliente).orElse(new Cliente());
    }

    @Override
    public Cliente insertar(Cliente cliente) {
        return repoCliente.save(cliente);
    }

    @Override
    public Cliente modificar(Cliente cliente) {
        return repoCliente.save(cliente);
    }

    @Override
    public void eliminar(String idCliente) {
        repoCliente.deleteById(idCliente);
    }

    @Override
    public List<Cliente> consultaPorCiudad(String ciudad) {

        return repoCliente.findByCiudad(ciudad);
    }

    @Override
    public List<Cliente> consultaPorCiudadYPais(String ciudad, String pais) {
        return repoCliente.findByCiudadAndPais(ciudad, pais);
    }

    @Override
    public List<Cliente> consulta3PrimerosEmpresaLike(String patron) {
        return repoCliente.findFirst3ByNombreEmpresaLike(patron);
    }

    @Override
    public List<CiudadPais> consultaDistintasCiudadesPais(String pais) {
        return repoCliente.findCiudadDistinctByPais(pais);
    }

    @Override
    public List<Cliente> consultaOrdenadoDescendente() {

        return repoCliente.findByOrderByNombreEmpresaDesc();
    }

    @Override
    public List<Cliente> consultaPorPais(List<String> paises) {
        return repoCliente.findByPaisIn(paises);
    }
}
