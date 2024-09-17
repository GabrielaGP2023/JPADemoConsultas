package com.example.DemoConsultas;

import com.example.DemoConsultas.Servicio.IServicioCliente;
import com.example.DemoConsultas.Servicio.IServicioProducto;
import com.example.DemoConsultas.modelo.CiudadPais;
import com.example.DemoConsultas.modelo.Cliente;
import com.example.DemoConsultas.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoConsultasApplication implements CommandLineRunner {
	@Autowired
	private IServicioCliente servicioCliente;

	@Autowired
	private IServicioProducto servicioProducto;

	public static void main(String[] args) {
		SpringApplication.run(DemoConsultasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("-----");
//		System.out.println(servicioCliente.consultarUno("ALFKI"));
//
//		System.out.println(servicioCliente.consultarTodos());
//
//		Cliente c1 = new Cliente("GGP01","Gabriela Gomez","Madrid","España");
//		System.out.println(servicioCliente.insertar(c1));
//
//		servicioCliente.eliminar("GGP01");
//		Producto p1 = new Producto((short) 88,"Prueba desde JPA", 3.0, (short)5,1);

//		System.out.println(servicioProducto.consultarUno((short) 1));
//		System.out.println(servicioProducto.insertar(p1));
//		System.out.println("---Consulta por Ciudad (Por nombre de método)");
//		System.out.println(servicioCliente.consultaPorCiudad("Madrid"));
//		System.out.println("Por Ciudad Pais");
//		System.out.println(servicioCliente.consultaPorCiudadYPais("Madrid","Spain"));
//		System.out.println("---Tres primeros--");
//		System.out.println(servicioCliente.consulta3PrimerosEmpresaLike("C%"));
//		System.out.println("---Distinto ---");
//		List <CiudadPais> resultados = servicioCliente.consultaDistintasCiudadesPais("Spain");
//		resultados
//				.forEach(cp ->System.out.println("Ciudad: " + cp.getCiudad() + ", País: " + cp.getPais()));
//
//		for (CiudadPais cp : resultados) {
//			System.out.println("Ciudad: " + cp.getCiudad() + ", País: " + cp.getPais());
//		}
//
//		System.out.println("---Ordenado---");
//		System.out.println(servicioCliente.consultaOrdenadoDescendente());
//		System.out.println("--- Paises ----");
//		System.out.println(servicioCliente.consultaPorPais(List.of("Spain","Mexico")));

		System.out.println("---Ejercicio filtro Categoria");
		short categoria = 1;
		System.out.println(servicioProducto.findBycategoryId(categoria));
		System.out.println("---Ejercicio comienza por n");
		System.out.println(servicioProducto.findByNombreProductoStartingWith("N"));
		System.out.println("---Ejercicio Ordenar --");
		System.out.println(servicioProducto.findOrderByNombreProducto());
		System.out.println("---Ejercicio filtro por precio");
		System.out.println(servicioProducto.findByUnitPriceGreaterThan(20));


	}
}
