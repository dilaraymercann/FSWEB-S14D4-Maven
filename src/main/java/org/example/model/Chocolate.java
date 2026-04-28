package org.example.model;

public class Chocolate extends ProductForSale{
    private boolean milky;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public boolean getMilky() {
        return milky;
    }

    @Override
    public void showDetails() {
        System.out.println("Milky " + milky);
    }
}
