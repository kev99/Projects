package com.utn.model;

import java.util.Date;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="tarjetas")

public class Tarjeta {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id ;  
	
	@Column
	private String marca;
	@Column
	private Integer numero;
	@Column
	private Date vencimiento;
	@Column
    private boolean validacion;
	@Column
	private String propietario;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Date getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(Date vencimiento) {
		this.vencimiento = vencimiento;
	}
	public boolean isValidacion() {
		return validacion;
	}
	public void setValidacion(boolean validacion) {
		this.validacion = validacion;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	
	
public Tarjeta(Integer id, String marca, Integer numero, Date vencimiento, boolean validacion, String propietario) {
		super();
		this.id = id;
		this.marca = marca;
		this.numero = numero;
		this.vencimiento = vencimiento;
		this.validacion = validacion;
		this.propietario = propietario;
	}

public Tarjeta(String marca, Integer numero, Date vencimiento, String propietario) {
	super();
	this.marca = marca;
	this.numero = numero;
	this.vencimiento = vencimiento;
	this.propietario = propietario;
}
public Tarjeta getDatos() {
		
		Tarjeta tarj= new Tarjeta(marca, numero, vencimiento, propietario) ;
		
		return tarj;
	}

}
