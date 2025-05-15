package org.example.model;

public class Coke extends ProductForSale{
    private boolean fresh;
    public Coke(String type, int price, String description, boolean fresh) {
        super(type, price, description);
        this.fresh = fresh;
    }

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Coke { " +
                "type: " + type + ", " +
                "description: " + description + ", " +
                "fresh: " + fresh + ", " +
                "price: " + price + " }");
    }
}
