package com.transaction;

import java.util.ArrayList;

public class Store implements Greetings {
    private String storeName;
    private int storeId;


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


    public void printStore() {
        System.out.println("Store Name: " + this.storeName);
        System.out.println("Id: " + this.storeId);
    }

    @Override
    public void weclomeMethod() {
        System.out.println("Welcome to "  + this.storeName);
    }

    @Override
    public void farewellMethod() {
        System.out.print("Goodbye from " + this.storeName);
    }
}
