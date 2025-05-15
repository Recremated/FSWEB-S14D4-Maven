package org.example.model;

public class Bread extends ProductForSale{
    private boolean fresh;
    public Bread(String type, int price, String description, boolean fresh) {
        super(type, price, description);
        this.fresh = fresh;
    }

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Bread { " +
                "type: " + type + ", " +
                "description: " + description + ", " +
                "fresh: " + fresh + ", " +
                "price: " + price + " }");
    }
}
