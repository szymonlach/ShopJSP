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

        String price1 = request.getParameter("cena1");
        String price2 = request.getParameter("cena2");
        String price3 = request.getParameter("cena3");
        String price4 = request.getParameter("cena4");

        String[] parameters = {price1,price2,price3,price4,product1,product2,product3,product4};
        for(int i =0;i<parameters.length;i++){
            if (parameters[i].isEmpty()){
                request.getRequestDispatcher("empty.jsp").forward(request,response);
            }
        }

        products.add(new Product(Double.valueOf(price1), product1));
        products.add(new Product(Double.valueOf(price2), product2));
        products.add(new Product(Double.valueOf(price3), product3));
        products.add(new Product(Double.valueOf(price4), product4));

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
