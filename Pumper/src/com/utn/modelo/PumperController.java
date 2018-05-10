package com.utn.modelo;

public class PumperController implements IPumper<Combo, Cajero , Hamburguesa>  {

	@Override
	public void mostrarPrecio(Combo pedido) {
		
		System.out.println("El precio es " + pedido.getPrecio()) ;
	}

	@Override
	public void cobrarPedido(Combo pedido , Cajero cajero ) {
		System.out.println("Se ha cobrado el pedido") ;
		int ventas= cajero.getCantidadventas();
		cajero.setCantidadventas(ventas + 1); 
	}

	@Override
	public void emitirFactura(Combo object) {
		System.out.println("Se ha emitido la factura") ;
		
	}

	@Override
	public void mostrarPerdido(Combo object, Hamburguesa object3) {
		 
		object.toString();
		object3.toString(); 
		
		
	}

	
	
	
	
}
