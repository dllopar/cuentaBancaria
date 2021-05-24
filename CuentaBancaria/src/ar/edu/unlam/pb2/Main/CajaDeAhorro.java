package ar.edu.unlam.pb2.Main;

public class CajaDeAhorro extends CuentaSueldo {


	private Integer numeroCajaDeAhorro;
	private final Integer CONTADOR_EXTRACCIONES=6;

	public CajaDeAhorro(String nombre, Integer numeroCajaDeAhorro) {
		
		super(nombre);
		this.numeroCajaDeAhorro=numeroCajaDeAhorro;
	}

	public Boolean contadorDeExtracciones() {
		
		Boolean contador=false;
		if(this.getContadorMovimientos()>CONTADOR_EXTRACCIONES) {
			this.setSaldo(this.getSaldo()-6);
			contador=true;
		}
		return contador;
	}

	
	
	

}
