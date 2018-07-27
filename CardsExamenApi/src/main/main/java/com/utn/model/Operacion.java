package com.utn.model;

public class Operacion {
	
	private Tasa tasa;
	private double consumo ;
	public Tasa getTasa() {
		return tasa;
	}
	public void setTasa(Tasa tasa) {
		this.tasa = tasa;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	public Operacion(Tasa tasa, double consumo) {
		super();
		this.tasa = tasa;
		this.consumo = consumo;
	}
	@Override
	public String toString() {
		return "Operacion [tasa=" + tasa + ", consumo=" + consumo + "]";
	}
	
	
}
