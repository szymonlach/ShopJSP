<%@ page import="java.util.List" %>
<%@ page import="edu.szymon.model.Product" %><%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 24.05.2018
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">

    <title>Basket</title>
</head>
<body>
<h1>Basket</h1>
    <% List<Product>products=(List<Product>) request.getAttribute("products");
        String sum =(String)String.valueOf(request.getAttribute("sum"));
        String mean = (String)String.valueOf(request.getAttribute("mean"));
    %>

<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">Product</th>
        <th scope="col">Price</th>
    </tr>
    </thead>
    <tbody>

    <tr>
        <th scope="row">1</th>
        <td><%out.print(products.get(0).getProduct()); %></td>
        <td><%out.print(products.get(0).getPrice()+"zl"); %></td>
    </tr>
    <tr>
        <th scope="row">2</th>
        <td><%out.print(products.get(1).getProduct()); %></td>
        <td><%out.print(products.get(1).getPrice()+"zl"); %></td>
    </tr>
    <tr>
        <th scope="row">3</th>
        <td><%out.print(products.get(2).getProduct()); %></td>
        <td><%out.print(products.get(2).getPrice()+"zl"); %></td>
    </tr>
    <tr>
        <th scope="row">4</th>
        <td><%out.print(products.get(3).getProduct()); %></td>
        <td><%out.print(products.get(3).getPrice()+"zl"); %></td>
    </tr>
    </tbody>
</table>
<h2>Sum: <% out.print(sum);%>zl</h2><br>
<h2>Mean: <% out.print(mean);%>zl</h2>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>

</body>
</html>
