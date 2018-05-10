<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/cobrosservlet" method="post" >
 
  Elija su bebida chica:
  <input type="radio" name="bebida" value="gaseosa">Gaseosa<br>
  <input type="radio" name="bebida" value="agua">Agua sin Gas<br>
<input type="submit" value="Enviar Pedido" />
   </form>
    Este combo viene con una hamburguesa con kétchup, mayonesa y queso simple
   Desea personalizar su hamburguesa? 
   <button onclick="myFunction()">Personalizar Hamburguesa</button>
   <div id="myDIV"  >
    
 <form action="cobrar" method="post" >
  Pan con centeno?<br>
  <input type="radio" name="centeno" value="Pan con centeno" checked>Si<br>
  <input type="radio" name="centeno" value="Pan sin centeno">No<br>
  Elija el queso:<br>
  <input type="radio" name="queso" value="Queso Simple">Queso Simple<br>
  <input type="radio" name="queso" value="Queso Doble">Queso Doble<br>
  <input type="radio" name="queso" value="Queso Cuadruple">Queso Cuadruple<br>
  Tipo de Hamburguesa?<br>
  <input type="radio" name="tipodeham" value="Hamburguesa Simple">Hamburguesa Simple<br>  
  <input type="radio" name="tipodeham" value="Hamburguesa Doble">Hamburguesa Doble<br>
    <input type="radio" name="tipodeham" value="Hamburguesa Triple">Hamburguesa Triple<br>
    <input type="radio" name="tipodeham" value="Hamburguesa Cuadruple">Hamburguesa Cuadruple<br>
   Huevo?<br>
   <input type="radio" name="Sin huevo" value="no">No<br> 
     <input type="radio" name="Con huevo" value="si">Si<br> 
   Cebolla?<br>
   <input type="radio" name="Sin cebolla" value="no">No<br> 
     <input type="radio" name="Con cebolla" value="si">Si<br> 
   Condimentos?<br> 
  <input type="checkbox" name="condimentos" value="Con mostaza">Mostaza<br>  
  <input type="checkbox" name="condimentos" value="Con ketchup">Ketchup<br>  
  <input type="checkbox" name="condimentos" value="Con mayonesa">Mayonesa<br> 
  <input type="hidden" name=nombrecombo value="pumperfeliz"> 
  <input type="submit" value="Enviar Pedido" />
    </form>
</div>

<script>
var x= document.getElementById("myDIV");
x.style.display = 'none'; 
</script>
<script>
function myFunction() {
    var x = document.getElementById("myDIV");
    if (x.style.display === "none") {
        x.style.display = "block";
    } else {
        x.style.display = "none";
    }
}
</script>
</body>
</html>