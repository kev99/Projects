package com.utn.modelo;
public class Combo {
    
	private int idCombo;
	private String nombre;	
	private int precio;
	private Hamburguesa hamburguesa;
	private Hamburguesa mobur;
	private String juguete ;
	private String nombreBebida;
	private String frenys;
	private String giniregalo;
	
	public int getPrecio() {
		if(nombre.equals("Pumper Feliz"))
			this.precio= 1000;
		
		else if(nombre.equals("Pumper Mediano"))
			this.precio= 2000;
		
		else if(nombre.equals("Pumper Grande"))
			this.precio= 4000;
		
		else if(nombre.equals("Pumper Super"))
			this.precio= 5000;
		return precio;
	}
	
	public int getIdCombo() {
		return idCombo;
	}
	public void setIdCombo(int idCombo) {
		this.idCombo = idCombo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Hamburguesa getHamburguesa() {
		return hamburguesa;
	}
	public void setHamburguesa(Hamburguesa hamburguesa) {
		this.hamburguesa = hamburguesa;
	}
	public String isJuguete() {
		return juguete;
	}
	
	public Hamburguesa getMobur() {
		return mobur;
	}

	public void setMobur(Hamburguesa mobur) {
		this.mobur = mobur;
	}

	public String getJuguete() {
		return juguete;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setJuguete(String juguete) {
		this.juguete = juguete;
	}
	public String getNombreBebida() {
		return nombreBebida;
	}
	public void setNombreBebida(String nombreBebida) {
		this.nombreBebida = nombreBebida;
	}
	public String getFrenys() {
		return frenys;
	}
	public void setFrenys(String frenys) {
		this.frenys = frenys;
	}
	public String getGiniregalo() {
		return giniregalo;
	}
	public void setGiniregalo(String giniregalo) {
		this.giniregalo = giniregalo;
	}
	public Combo(String nombre, Hamburguesa hamburguesa, String juguete, String nombreBebida, String frenys,
			String giniregalo) {
		super();
		this.nombre = nombre;
		this.hamburguesa = hamburguesa;
		this.juguete = juguete;
		this.nombreBebida = nombreBebida;
		this.frenys = frenys;
		this.giniregalo = giniregalo;
	}
	
	public Combo(String nombre, int precio, Hamburguesa hamburguesa, String juguete, String nombreBebida, String frenys,
			String giniregalo) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.hamburguesa = hamburguesa;
		this.juguete = juguete;
		this.nombreBebida = nombreBebida;
		this.frenys = frenys;
		this.giniregalo = giniregalo;
	}

	public Combo(String nombre, int precio, Hamburguesa hamburguesa, Hamburguesa mobur, String juguete,
			String nombreBebida, String frenys, String giniregalo) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.hamburguesa = hamburguesa;
		this.mobur = mobur;
		this.juguete = juguete;
		this.nombreBebida = nombreBebida;
		this.frenys = frenys;
		this.giniregalo = giniregalo;
	}

	public Combo(String nombre, Hamburguesa hamburguesa, Hamburguesa mobur, String juguete, String nombreBebida,
			String frenys, String giniregalo) {
		super();
		this.nombre = nombre;
		this.hamburguesa = hamburguesa;
		this.mobur = mobur;
		this.juguete = juguete;
		this.nombreBebida = nombreBebida;
		this.frenys = frenys;
		this.giniregalo = giniregalo;
	}

	public Combo(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Combo [nombre=" + nombre + ", precio=" + precio + ", hamburguesa=" + hamburguesa.toString() + ", mobur=" + mobur
				+ ", juguete=" + juguete + ", nombreBebida=" + nombreBebida + ", frenys=" + frenys + ", giniregalo="
				+ giniregalo + "]";
	}
	
	
	
}
