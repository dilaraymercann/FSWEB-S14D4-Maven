package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Chocolate", 10.5, "Dark chocolate");
        products[1] = new Coke("Coke", 5.0, "Cold drink");
        products[2] = new Bread("Bread", 3.5, "Whole grain bread");
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products) {
            product.showDetails();
        }
    }
}