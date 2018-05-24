<%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 24.05.2018
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sklep</title>
</head>
<body>
<h1>Sklep</h1>
<form method="post" action="buy.jsp">
    <input type="text" name="Product1" placeholder="Product">
    <input type="number" name="cena1" placeholder="Cena"><br>
    <input type="text" name="Produkt2" placeholder="Product">
    <input type="number" name="cena2" placeholder="Cena"><br>
    <input type="text" name="Produkt3" placeholder="Product">
    <input type="number" name="cena3" placeholder="Cena"><br>
    <input type="text" name="Produkt4" placeholder="Product">
    <input type="number" name="cena4" placeholder="Cena"><br>
    <input type="submit" value="Kupuje">

</form>
</body>
</html>
