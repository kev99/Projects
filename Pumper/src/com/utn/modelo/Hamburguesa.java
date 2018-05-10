package com.utn.modelo;

public class Hamburguesa {

	private String tipo;
	private String queso;
	private String huevo;
	private String centeno; 
	private String cebolla;
	private String condimentos;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getQueso() {
		return queso;
	}
	public void setQueso(String queso) {
		this.queso = queso;
	}
	public String isHuevo() {
		return huevo;
	}
	public void setHuevo(String huevo) {
		this.huevo = huevo;
	}
	public String isCenteno() {
		return centeno;
	}
	public void setCenteno(String centeno) {
		this.centeno = centeno;
	}
	public String getCondimentos() {
		return condimentos;
	}
	public void setCondimentos(String condimentos) {
		this.condimentos = condimentos;
	}
	public String getCebolla() {
		return cebolla;
	}
	public void setCebolla(String cebolla) {
		this.cebolla = cebolla;
	}
	public String getHuevo() {
		return huevo;
	}
	public String getCenteno() {
		return centeno;
	}
	public Hamburguesa(String tipo, String queso, String huevo, String centeno, String cebolla, String condimentos) {
		super();
		this.tipo = tipo;
		this.queso = queso;
		this.huevo = huevo;
		this.centeno = centeno;
		this.cebolla = cebolla;
		this.condimentos = condimentos;
	}
	@Override
	public String toString() {
		return "Hamburguesa [Tipo De Hamburguesa=" + tipo + ", Queso=" + queso + ", Huevo=" + huevo + ", Centeno=" + centeno
				+ ", Cebolla=" + cebolla + ", Condimentos=" + condimentos + "]";
	}
	
	
}
