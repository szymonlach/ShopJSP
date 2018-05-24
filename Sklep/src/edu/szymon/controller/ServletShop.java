package edu.szymon.controller;

import edu.szymon.buisnesslogic.PriceCalculator;
import edu.szymon.model.Product;

import javax.print.DocFlavor;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/buy")
public class ServletShop extends HttpServlet {

    PriceCalculator priceCalculator = new PriceCalculator();
    List<Product> products;
    double mean;
    double sum;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        products = new ArrayList<>();

        String product1 = request.getParameter("Product1");
        String product2 = request.getParameter("Product2");
        String product3 = request.getParameter("Product3");
        String product4 = request.getParameter("Product4");

        double price1 = Double.valueOf(request.getParameter("cena1"));
        double price2 = Double.valueOf(request.getParameter("cena2"));
        double price3 = Double.valueOf(request.getParameter("cena3"));
        double price4 = Double.valueOf(request.getParameter("cena4"));
        products.add(new Product(price1, product1));
        products.add(new Product(price2, product2));
        products.add(new Product(price3, product3));
        products.add(new Product(price4, product4));

        mean = priceCalculator.mean(products);
        sum = priceCalculator.sum(products);

        request.setAttribute("products", products);
        request.setAttribute("sum", sum);
        request.setAttribute("mean", mean);
        request.getRequestDispatcher("buy.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("nananana");
    }
}
