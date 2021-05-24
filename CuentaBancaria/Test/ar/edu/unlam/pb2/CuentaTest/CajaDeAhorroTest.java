package ar.edu.unlam.pb2.CuentaTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.Main.CajaDeAhorro;
import ar.edu.unlam.pb2.Main.CuentaSueldo;

public class CajaDeAhorroTest {

	@Test
	public void testQueVerificaSiExisteLaCajaDeAhorro() {
		
		String nombre= "Carlos Lopez";
		Integer numeroCuenta = 12345;
		CajaDeAhorro caja1 = new CajaDeAhorro(nombre, numeroCuenta);
		
		assertNotNull(caja1);
	}
	
	@Test
	public void testQueVerificaSiSePuedeExtraerDinero() {
		
		String nombre= "Carlos Lopez";
		Integer numeroCuenta = 12345;
		CajaDeAhorro caja1 = new CajaDeAhorro(nombre, numeroCuenta);
		
		caja1.ingresarDinero(500.0);
		caja1.extraerDinero(300.0);
		Double actual = caja1.getSaldo();
		Double esperado = 200.0;
		
		assertEquals(actual, esperado);
	}
	
	@Test
	public void testQueVerificaQueSiPasaMasDeSeisExtraccionesSeCobraUnAdicionalDe6Pesos() {
		
		String nombre= "Carlos Lopez";
		Integer numeroCuenta = 12345;
		CajaDeAhorro caja1 = new CajaDeAhorro(nombre, numeroCuenta);
		
		caja1.ingresarDinero(500.0);
		caja1.extraerDinero(30.0);
		caja1.extraerDinero(30.0);
		caja1.extraerDinero(30.0);
		caja1.extraerDinero(30.0);
		caja1.extraerDinero(30.0);
		caja1.extraerDinero(30.0);
		caja1.extraerDinero(30.0);
		
		assertTrue(caja1.contadorDeExtracciones());
	}
	
	public void testQueVerificaQueSiPasaMasDeSeisExtraccionesSeDescuentanSeisPesos() {
		
		String nombre= "Carlos Lopez";
		Integer numeroCuenta = 12345;
		CajaDeAhorro caja1 = new CajaDeAhorro(nombre, numeroCuenta);
		
		caja1.ingresarDinero(500.0);
		caja1.extraerDinero(30.0);
		caja1.extraerDinero(30.0);
		caja1.extraerDinero(30.0);
		caja1.extraerDinero(30.0);
		caja1.extraerDinero(30.0);
		caja1.extraerDinero(30.0);
		caja1.extraerDinero(30.0);
		
		Double actual = caja1.getSaldo();
		Double esperado = 284.0;
		
		assertEquals(actual, esperado);
	}
	
	
}
