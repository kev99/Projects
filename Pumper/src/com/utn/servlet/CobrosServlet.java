package com.utn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utn.modelo.Cajero;
import com.utn.modelo.Combo;
import com.utn.modelo.Hamburguesa;
import com.utn.modelo.PumperController;

/**
 * Servlet implementation class cobroservlet
 */
@WebServlet("/cobrar")
public class CobrosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CobrosServlet() {
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
	protected void doPost(HttpServletRequest req , HttpServletResponse res ) throws ServletException, IOException {
		 res.setContentType("text/html");
		 
		 PrintWriter out = res.getWriter();
				
		String combo= req.getParameter("combo");
		String centeno= req.getParameter("centeno");
		String huevo= req.getParameter("huevo");
		String[] condimentos= req.getParameterValues("condimentos");
		String queso= req.getParameter("queso");
		String tipodeh= req.getParameter("tipodeham");
		String bebida= req.getParameter("bebida");

 Hamburguesa happyburguer= new Hamburguesa("Hamburguesa Simple", "Queso Simple", "Sin huevo", "Pan con centeno","Sin cebolla", "Ketchup y Mayonesa");
 Hamburguesa mediumburguer= new Hamburguesa("Hamburguesa Doble", "Queso Doble", "Con huevo", "Pan sin centeno","Con Cebolla" ,"Ketchup y Mayonesa");
 Hamburguesa bigburguer= new Hamburguesa("Hamburguesa Triple", "Queso Cuadruple", "Sin huevo", "Pan sin centeno","Sin Cebolla" ,"Sin Condimentos");
 Hamburguesa superburguer= new Hamburguesa("Hamburguesa Cuadruple", "Queso Simple", "Sin huevo", "Pan sin centeno","Sin Cebolla" ,"Sin condimentos");
 Hamburguesa moburburguer= new Hamburguesa("Hamburguesa Simple", "Sin Queso", "Con huevo", "Pan sin centeno","Sin Cebolla" ,"Sin Condimentos");


Combo pumperfeliz= new Combo(combo, happyburguer, "Un muñeco de Pikachu","Bebida chica", "Sin frenys","Sin ginis"); 
Combo pumpermediano= new Combo(combo, mediumburguer, "Sin juguete","Gaseosa Mediana", "Frenys Medianas","Sin ginis"); 
Combo pumpergrande= new Combo(combo, bigburguer, "Sin juguete","Gaseosa Mediana", "Frenys Grande","Con una gini"); 
Combo pumpersuper= new Combo(combo, superburguer, moburburguer, "Sin juguete","Cerveza", "Sin Frenys","Con dos ginis"); 
PumperController pc= new PumperController();
Cajero cajero= new Cajero();

if(combo.equals("pumperfeliz")) {
 pc.cobrarPedido(pumperfeliz, cajero);
 out.println("Se ha cobrado el pedido") ;
 pc.emitirFactura(pumperfeliz);
 out.println("Se ha emitido la factura") ;
 pc.mostrarPrecio(pumperfeliz);
 out.println("El precio es " + pumperfeliz.getPrecio()) ;

}else if(combo.equals("pumpermediano")) {
 pc.cobrarPedido(pumpermediano, cajero);
 out.println("Se ha cobrado el pedido") ;
 pc.emitirFactura(pumpermediano);
 out.println("Se ha emitido la factura") ;
 out.println("El precio es " + pumpermediano.getPrecio()) ;
 
}else if(combo.equals("pumpergrande")) {
 pc.cobrarPedido(pumpergrande, cajero);
 out.println("Se ha cobrado el pedido") ;
 pc.mostrarPrecio(pumpergrande);
 out.println("Se ha emitido la factura") ;
 pc.emitirFactura(pumpergrande);
 out.println("El precio es " + pumpergrande.getPrecio()) ;
 
}else if(combo.equals("pumpersuper")) {
	 pc.cobrarPedido(pumpersuper, cajero);
	 out.println("Se ha cobrado el pedido") ;
	 pc.mostrarPrecio(pumpersuper);
	 out.println("Se ha emitido la factura") ;
	 pc.emitirFactura(pumpersuper);
	 out.println("El precio es " + pumpersuper.getPrecio()) ;
		}
	 
}}
