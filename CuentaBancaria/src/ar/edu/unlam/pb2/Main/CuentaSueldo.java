package ar.edu.unlam.pb2.Main;

public class CuentaSueldo {

	private String nombre;
	private Double saldo;
	private Integer contadorMovimientos;

	public CuentaSueldo(String nombre) {
		this.nombre=nombre;
		saldo=0.0;
		contadorMovimientos=0;
	}

	public Double ingresarDinero(Double ingreso) {
		
		
		return saldo+=ingreso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Boolean extraerDinero(Double extraccion) {
		Boolean operacionOK = false;
		
		if(this.getSaldo()>=extraccion) {
			saldo-=extraccion;
			operacionOK=true;
			contadorMovimientos++;
		}
		return operacionOK;
	}

	public Integer getContadorMovimientos() {
		return contadorMovimientos;
	}

	public void setContadorMovimientos(Integer contadorMovimientos) {
		this.contadorMovimientos = contadorMovimientos;
	}

}
