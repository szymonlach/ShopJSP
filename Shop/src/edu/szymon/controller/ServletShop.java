package edu.szymon.controller;

import edu.szymon.buisnesslogic.PriceCalculator;
import edu.szymon.model.Product;

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

    private PriceCalculator priceCalculator = new PriceCalculator();
    private List<Product> products;
    private double mean;
    private double sum;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        products = new ArrayList<>();

        String product1 = request.getParameter("Product1");
        String product2 = request.getParameter("Product2");
        String product3 = request.getParameter("Product3");
        String product4 = request.getParameter("Product4");

        String price1 = request.getParameter("price1");
        String price2 = request.getParameter("price2");
        String price3 = request.getParameter("price3");
        String price4 = request.getParameter("price4");

        String[] prices = {price1, price2, price3, price4};
        String[] parameters = {product1, product2, product3, product4};
        List<Integer> list = new ArrayList<>();

        int k = 0;
        for (int i = 0; i < parameters.length; i++) {
            if (parameters[i].isEmpty()) {
                k++;
                if (k == 4) {
                    request.getRequestDispatcher("empty.jsp").forward(request, response);
                }
            } else {
                list.add(i);
            }
        }

        for (Integer element : list) {
            System.out.println(element);
            products.add(new Product(Double.valueOf(prices[element]),parameters[element]));
        }

        mean = priceCalculator.mean(products);
        sum = priceCalculator.sum(products);

        request.setAttribute("products", products);
        request.setAttribute("sum", sum);
        request.setAttribute("mean", mean);
        request.getRequestDispatcher("buy.jsp").forward(request, response);
    }
}

