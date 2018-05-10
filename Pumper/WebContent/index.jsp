<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Bienvenido a Pumper</h1>
<h2>Elija su combo</h2>
<h2>Si lo desea puede personalizar algunas cosas a su gusto!</h2>
<p>Pumper feliz: Juguete para niño y niña.
 Hamburguesa con kétchup, mayonesa, queso.
 Pan con centeno. Bebida pequeña. Gaseosa o Agua sin gas</p><br>
 <hr>
 <p>Pumper Mediano: Doble Hamburguesas con doble queso.
 Frenys medianas, cebolla, mayonesa, y kétchup. 
 Gaseosa mediana</p>
 <hr>
 <p>Pumper Grande: Triple Hamburguesa con cuádruple queso.
  Frenys grande.
  Condimentos opcionales
  Bebida Grande o mediana<p>

<form action="cobrar" method="post" >
  <input type="radio" name="combo" value="pumperfeliz" checked>Pumper Feliz<br>
  <input type="radio" name="combo" value="pumpermediano">Pumper Mediano<br>
  <input type="radio" name="combo" value="pumpergrande">Pumper Grande<br>
  <input type="radio" name="combo" value="pumpersuper">Pumper Super<br>
<input type="submit" value="Enviar Pedido" />
   </form>
<hr>
  <br> 
  <form action="personalizarC1.jsp"  >
  <input type="submit" value="Personalizar Pumper Feliz  !" />
      </form>
 <form action="personalizarC2.jsp"  >
  <input type="submit" value="Personalizar Pumper Mediano!" />
      </form>
       <form action="personalizarC3.jsp"  >
  <input type="submit" value="Personalizar Pumper Grande !" />
      </form>
       <form action="personalizarC4.jsp"  >
  <input type="submit" value="Personalizar Pumper Super !" />
      </form>

</body>
</html>