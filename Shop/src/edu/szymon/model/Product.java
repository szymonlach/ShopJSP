package edu.szymon.model;

public class Product {


    private double price;
    private String product;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Product(double price, String product) {
        this.price = price;
        this.product = product;
    }
}
