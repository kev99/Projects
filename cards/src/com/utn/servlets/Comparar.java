package com.utn.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utn.modelo.Cliente;
import com.utn.modelo.Tarjeta;
import com.utn.modelo.TarjetaController;

/**
 * Servlet implementation class Comparar
 */
@WebServlet("/Comparar")
public class Comparar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Comparar() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String vencimientostr = request.getParameter("vencimiento");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date vencimiento= null;
		PrintWriter out = response.getWriter();
		try {
			vencimiento = (Date)sdf.parse(vencimientostr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();  	}
		String titular  = request.getParameter("titular");
		String marca  = request.getParameter("marca");
		int numero = Integer.parseInt(request.getParameter("numero "));
		String vencimientostr2 = request.getParameter("vencimiento2");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
		Date vencimiento2= null;
		try {
			vencimiento2 = (Date)sdf.parse(vencimientostr2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String titular2 = request.getParameter("titular2");
		String marca2 = request.getParameter("marca2");
		int numero2 = Integer.parseInt(request.getParameter("numero2"));
		Cliente cliente1 = new Cliente( request.getParameter("titular"));
		Cliente cliente2 = new Cliente( request.getParameter("titular2"));
        Tarjeta tarj1= new Tarjeta(cliente1, marca, numero, vencimiento);
	 Tarjeta tarj2= new Tarjeta(cliente2, marca2, numero2, vencimiento2);
		TarjetaController tc= new TarjetaController();
		
		if (tc.compararTarjetas(tarj1, tarj2)){
            out.println("<br>" );
            out.println("Las tarjetas son iguales");
           
        }else{
        	out.println("Las tarjetas no son iguales") ;       }		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
