package org.example.model;

public class Bread extends ProductForSale{
    private String size;

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    public String getSize() {
        return size;
    }

    @Override
    public void showDetails() {
        System.out.println("Size: " + size);
    }
}
