package com.transaction;

import java.util.ArrayList;
import java.util.List;

public class Store implements Greetings {
    private String storeName;
    private int storeId;
    private final List<Food> foodList = new ArrayList<>();

    public Store(String storeName, int storeId){
        this.storeId= storeId;
        this.storeName= storeName;

    }
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public void removeFoodItem(int index){
        System.out.println("Removing by index");
        foodList.remove(index);
    }
    public void removeFoodItem(Food food){
        System.out.println("Removing by object");
        foodList.remove(food);
    }


    public void printStore() {
        System.out.println("Store Name: " + this.storeName);
        System.out.println("Id: " + this.storeId);
        for (Food food : foodList){
            System.out.println("Food Id: " + food.getId());
            System.out.println("Name: " + food.getName());
            System.out.println("Quantity: " + food.getQuantity());
            System.out.println("Brand: " + food.getBrand());
            System.out.println("Total: " + food.getTotalCost());

        }
    }

    @Override
    public void weclomeMethod() {
        System.out.println("Welcome to "  + this.storeName);
    }

    @Override
    public void farewellMethod() {
        System.out.print("Goodbye from " + this.storeName);
    }

    public void addFoodItem(Food food){
        foodList.add(food);
    }


}
