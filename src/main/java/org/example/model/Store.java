package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = {
                new Bread("White Bread", 10, "Fresh white bread", true),
                new Chocolate("White Chocolate", 12, "%100 natural milk", false),
                new Coke("Moca-Cola", 10, "Sugar-Free", true)
        };

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println();
        }
    }
}