package com.utn.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utn.modelo.Cliente;
import com.utn.modelo.Tarjeta;

/**
 * Servlet implementation class MostrarDatos
 */
@WebServlet("/MostrarDatos")
public class MostrarDatos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostrarDatos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		String vencimientostr = request.getParameter("vencimiento");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date vencimiento= null;
		try {
			vencimiento = (Date)sdf.parse(vencimientostr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String marca = request.getParameter("marca");
		int numero = Integer.parseInt(request.getParameter("numero"));
       
		response.setContentType("text/html");
         Cliente cliente = new Cliente( request.getParameter("titular"));
         Tarjeta tarj= new Tarjeta(cliente, marca, numero, vencimiento);
   	
          PrintWriter out = response.getWriter();
          RequestDispatcher rd;
          out.println("<br>" );
          out.println("Datos de su tarjeta: " + tarj.toString() );
	
         
		
		
		
		
		
		
		
	}

}
