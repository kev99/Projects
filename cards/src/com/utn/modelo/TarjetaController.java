package com.utn.modelo;

import java.util.Calendar;
import java.util.Date;

public class TarjetaController implements ITarjeta <Tarjeta,Operacion> {

	
	@Override
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
	@Override
	public boolean validarOperacion(Operacion oper) {
			boolean val= false;
			
			if(oper.getConsumo() <= 100)
				val=true;
				
			return val;
	}
	@Override
	public boolean compararTarjetas(Tarjeta tarj1, Tarjeta tarj2) {
		boolean res= false; 
		
		if (tarj1.getNumero()==(tarj2.getNumero()) && tarj1.getTitular().equals
 (tarj2.getTitular())
				&& tarj1.getMarca().equals(tarj2.getMarca()) && tarj1.getVencimiento().equals(tarj2.getVencimiento())	){
            res=true;  
           
        }else{
          
        }		 
        return res;
	}
	@Override
	public void imprimirFactura() {
		
		System.out.println("La factura ha sido imprimida Correctamente");
	}
	@Override
	public  void enviarInfoTC(Tarjeta tarj) {
		 
		System.out.println("Los siguientes datos fueron enviados");
		System.out.println(tarj.getDatos()) ;
		System.out.println(tarj.toString());
		
	}
	@Override
	public boolean informarPago() {
		System.out.println("El pago ha sido informado");
		return false;
	}
	@Override
	public void actualizarSaldo(Tarjeta object) {
		// TODO Auto-generated method stub
		
	}
	
		
	
}
