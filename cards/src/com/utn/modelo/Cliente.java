package com.utn.modelo;

public class Cliente {

	private static String name;
	private double saldo ;
	
	
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		
		
	}
	
	@Override
	public String toString() {
		return  "Nombre: " + name + "  Saldo= " + saldo;

	}
	public Cliente(String name) {
		super();
		this.name = name;
	}


	

	

	
	
	
}
