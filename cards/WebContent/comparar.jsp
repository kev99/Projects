<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Ingrese Por Favor Los Datos De Las Tarjetas</h2>
<form action="/Comparar" method="post" >
 
  <input type="radio" name="marca" value="squa" checked>SQUA<br>
  <input type="radio" name="marca" value="sco">SCO<br>
  <input type="radio" name="marca" value="pere ">PERE<br>
  <input type="number" name="numero" placeholder="Numero de la Tarjeta" required> <br>
  <input type="text" name="titular" placeholder="Titular de la Tarjeta" required> <br>
  Fecha de Vencimiento: 
  <br>
  <input type="date" name="vencimiento" placeholder="Fecha de Vencimiento" required> <br>
<br>
<hr>
  <input type="radio" name="marca2" value="squa" checked>SQUA<br>
  <input type="radio" name="marca2" value="sco">SCO<br>
  <input type="radio" name="marca2" value="pere ">PERE<br>
  <input type="number" name="numero2" placeholder="Numero de la Tarjeta" required> <br>
  <input type="text" name="titular2" placeholder="Titular de la Tarjeta" required> <br>
  Fecha de Vencimiento: 
  <br>
  <input type="date" name="vencimiento2" placeholder="Fecha de Vencimiento" required> <br>
  <script>
var x ="numero2";
var y ="numero";
document.getElementById("demo").innerHTML = ("number" === "number2");
</script>
  <input type="submit" value="Listo!" />
  
  <p id="demo"></p>

 
  
</form>
</body>
</html>