package org.example.model;

public class Chocolate extends ProductForSale{
    private boolean fresh;
    public Chocolate(String type, int price, String description,boolean fresh) {
        super(type, price, description);
        this.fresh = fresh;
    }

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate { " +
                "type: " + type + ", " +
                "description: " + description + ", " +
                "fresh: " + fresh + ", " +
                "price: " + price + " }");
    }
}
