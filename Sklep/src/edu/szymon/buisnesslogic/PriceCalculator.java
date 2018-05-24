package edu.szymon.buisnesslogic;

import edu.szymon.model.Product;

import java.util.List;

public class PriceCalculator {


    public double mean(List<Product> products) {
        double mean = sum(products) / products.size();
        return mean;
    }

    public double sum(List<Product> products) {
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }

        return sum;
    }
}
