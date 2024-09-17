package com.example.DemoConsultas.repositorio;

import com.example.DemoConsultas.modelo.CiudadPais;
import com.example.DemoConsultas.modelo.Cliente;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IRepositoryCliente extends JpaRepository<Cliente, String> {

    List<Cliente> findByCiudad(String ciudad);
    //    List<Cliente> findDistinctCiudadByPais(String pais);
    List<Cliente> findByCiudadAndPais(String ciudad, String pais);

    List<Cliente> findFirst3ByNombreEmpresaLike(String patron);

    List<CiudadPais> findCiudadDistinctByPais(String pais);

    List<Cliente> findByOrderByNombreEmpresaDesc();

    List<Cliente> findByPaisIn(List<String> paises);

   
}
