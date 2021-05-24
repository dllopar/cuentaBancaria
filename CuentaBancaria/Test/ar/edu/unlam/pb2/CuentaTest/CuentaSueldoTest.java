package ar.edu.unlam.pb2.CuentaTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.Main.CuentaSueldo;
import junit.framework.Assert;

public class CuentaSueldoTest {

	@Test
	public void testQueVerificaSiExisteLaCuenta() {
		
		String nombre= "Carlos Lopez";
		CuentaSueldo cuenta1 = new CuentaSueldo(nombre);
		
		assertNotNull(cuenta1);
	}
	
	@Test
	public void testQueVerificaSiSePuedeIngresarDineroALaCuenta() {
		
		String nombre= "Carlos Lopez";
		CuentaSueldo cuenta1 = new CuentaSueldo(nombre);
		
		Double saldo = cuenta1.ingresarDinero(500.0);
		Double actual = cuenta1.getSaldo();
		
		assertEquals(saldo, actual);
	}
	
	@Test
	public void testQueVerificaQueSePuedeRetirarDineroDeLaCuenta() {
		
		String nombre= "Carlos Lopez";
		CuentaSueldo cuenta1 = new CuentaSueldo(nombre);
		
		cuenta1.ingresarDinero(500.0);
		cuenta1.extraerDinero(300.0);
		Double actual = cuenta1.getSaldo();
		Double esperado = 200.0;
		
		assertEquals(actual, esperado);
	}
	
	@Test
	public void testQueVerificaQueNoSePuedeRetirarDineroDeLaCuenta() {
		
		String nombre= "Carlos Lopez";
		CuentaSueldo cuenta1 = new CuentaSueldo(nombre);
		
		cuenta1.ingresarDinero(500.0);
		
		assertFalse(cuenta1.extraerDinero(600.0));
	}
	
	

}
