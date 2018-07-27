package com.utn.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utn.modelo.Operacion;
import com.utn.modelo.TarjetaController;
import com.utn.modelo.Tasa;

/**
 * Servlet implementation class Operar
 */
@WebServlet("/Operar")
public class Operar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Operar() {
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
		PrintWriter out = response.getWriter();

		double consumo=Double.parseDouble( request.getParameter("consumo"));
		String marca = request.getParameter("marca");
		Tasa tasa1= new Tasa(marca);
		
		double tasa= tasa1.getTasa();
		 
		Operacion op= new Operacion(tasa1, consumo ) ;
		
		TarjetaController tc= new TarjetaController();
		 
		if(tc.validarOperacion(op)) {
			out.print("La operacion se ha realizado con exito ") ;
            out.print(op.toString()) ;
            tc.enviarInfoTC(tarj);
            
			   	
		} else {

			out.print("La operacion no es valida ") ;
		
		
		
	}
	}}
