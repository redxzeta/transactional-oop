package com.transaction;

abstract class Items {
    private int id;
    private String name;
    protected double cost;
    public Items(int id, String name, double cost){
        this.id=id;
        this.name=name;
        this.cost=cost;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void printItem(){
        System.out.println("Item: " + this.name);
        System.out.println("cost: " + this.cost);
        System.out.println("id: " + this.id);
    }

    public abstract void totalCost();
}
