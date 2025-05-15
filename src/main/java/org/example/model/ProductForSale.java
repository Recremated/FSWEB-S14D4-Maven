package org.example.model;

public abstract class ProductForSale {
    String type;
    int price;
    String description;

    public ProductForSale(String type ,int price, String description){
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public int getSalesPrice(int quantity){
        return (price*quantity);
    }

    abstract void showDetails();
}
