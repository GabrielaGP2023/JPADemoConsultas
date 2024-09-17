package com.example.DemoConsultas.modelo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "customers")
//@NamedQuery(name = "Cliente.consultaPorPais",
//query = "select c from Cliente c where c.pais =?1")
public class Cliente {

    @Id
    @Column(name="customer_id", length = 5)
    private String idCliente;
    @Column(name="company_name", nullable = false, length = 40)
    private String nombreEmpresa;
    @Column(name="city", length = 15)
    private String ciudad;
    @Column(name="country",  length = 15)
    private String pais;


}
