package com.utn.modelo;

import java.util.Date;
 
public class Tarjeta {

	
	private Cliente titular;
	private String marca;
	private int numero;
	private Date vencimiento;
    private int id ;   
    private boolean validacion;
   
	 
	public Tarjeta getDatos() {
		
		Tarjeta tarj1= new Tarjeta(titular , marca , numero , vencimiento) ;
		
		return tarj1;
	}
	
	@Override
	public String toString() {
		return "Tarjeta [titular=" + Cliente.getName() + ", marca=" + marca + ", numero=" + numero + ", vencimiento="
				+ vencimiento + "]";
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(Date vencimiento) {
		this.vencimiento = vencimiento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isValidacion() {
		return validacion;
	}

	public void setValidacion(boolean validacion) {
		this.validacion = validacion;
	}

	public Tarjeta() {
		// TODO Auto-generated constructor stub
	}
	public Tarjeta(Date vencimiento) {
		// TODO Auto-generated constructor stub
	}

	public Tarjeta(Cliente cliente  , String marca , int numero , Date vencimiento) {
		// TODO Auto-generated constructor stub
		
		
	}

	
}
