package com.utn.modelo;



public interface ITarjeta<T,O> {

	boolean tarjetaValidar(T object );
    
    boolean validarOperacion(O object);
	
    boolean compararTarjetas(T object , T object2);
    
    void imprimirFactura();
    void enviarInfoTC(T object);
	boolean informarPago();
	void actualizarSaldo(T object);	
	
}                    

