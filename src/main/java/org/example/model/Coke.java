package org.example.model;

public class Coke extends ProductForSale{
    private boolean isSugar;

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public boolean getSugar() {
        return isSugar;
    }

    @Override
    public void showDetails() {
        System.out.println("Sugar: " + isSugar);
    }
}
