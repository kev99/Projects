package com.utn.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utn.modelo.TarjetaController;
import com.utn.modelo.Tarjeta;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
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
		Tarjeta tarj= new Tarjeta(vencimiento);
        TarjetaController tc = new TarjetaController();
     
        if(tc.tarjetaValidar(tarj) )  {
    	
     RequestDispatcher rd = request.getRequestDispatcher("acciones.jsp");
 	 rd.forward(request, response);
		
		}else {
			  request.getRequestDispatcher(" tarjetavencida.jsp");
		}
	}
}






