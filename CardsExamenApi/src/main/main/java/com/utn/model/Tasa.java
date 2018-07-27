package com.utn.model;

import java.time.LocalDateTime;

public class Tasa {

	private double tasa;
	private String marca;
	 
	public Tasa  (String marca) {
		LocalDateTime today = LocalDateTime.now(); 
		
		if(marca.equals("SQUA"))
			this.tasa = today.getYear()/today.getMonthValue();
		
		else if(marca.equals("SCO"))
			this.tasa = today.getDayOfMonth() * 0.5;
		
		else if(marca.equals("PERE"))
			this.tasa = today.getMonthValue() * 0.1;
	}

	public double getTasa() {
		return tasa;
	}

	public void setTasa(double tasa) {
		this.tasa = tasa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Tasa(double tasa) {
		super();
		this.tasa = tasa;
	}
	
	
}
