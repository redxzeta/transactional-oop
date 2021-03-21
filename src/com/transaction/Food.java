package com.transaction;

public class Food extends Items {
    private int quantity;
    private String brand;
    final double serviceFee = 1.25;
    public Food(int id, String name, double cost, int quantity, String brand) {
        super(id, name, cost);
        this.setQuantity(quantity);
        this.setBrand(brand);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void totalCost() {
        double total = quantity * this.cost + serviceFee ;
        System.out.println("The total: " + total);
    }
}
