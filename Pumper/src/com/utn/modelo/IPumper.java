package com.utn.modelo;

public interface IPumper <P, C, H > {
   
	void mostrarPrecio(P object);
    void cobrarPedido(P object, C object2);
     void emitirFactura(P object);
	 void mostrarPerdido(P object, H object3 );
}
