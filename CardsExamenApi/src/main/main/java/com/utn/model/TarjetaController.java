package com.utn.model;

import java.util.Calendar;
import java.util.Date;

public class TarjetaController implements ITarjeta <Tarjeta,Operacion> {

	
	public boolean tarjetaValidar (Tarjeta tarj) {
		Boolean res = false; 
		Date today = Calendar.getInstance().getTime();
		if(tarj.getVencimiento().after(today)) {
		    res=true;
		    tarj.setValidacion(true);
		
		} else {

		}
		return res;
		
	}
	public boolean validarOperacion(Operacion oper) {
			boolean val= false;
			
			if(oper.getConsumo() <= 100)
				val=true;
				
			return val;
	}
	public boolean compararTarjetas(Tarjeta tarj1, Tarjeta tarj2) {
		boolean res= false; 
		
		if (tarj1.getNumero()==(tarj2.getNumero()) && tarj1.getPropietario().equals
 (tarj2.getPropietario())
				&& tarj1.getMarca().equals(tarj2.getMarca()) && tarj1.getVencimiento().equals(tarj2.getVencimiento())	){
            res=true;  
           
        }else{
          
        }		 
        return res;
	}
	public void imprimirFactura() {
		
		System.out.println("La factura ha sido imprimida Correctamente");
	}
	public void enviarInfoTC(Tarjeta tarj) {
		 
		System.out.println("Los siguientes datos fueron enviados");
		System.out.println(tarj.getDatos()) ;
		System.out.println(tarj.toString());
		
	}
	public boolean informarPago() {
		// TODO Auto-generated method stub
		return false;
	}
	public void actualizarSaldo(Tarjeta object) {
		// TODO Auto-generated method stub
		
	}
	
		
	
}
