package com.transaction;

import java.util.ArrayList;

public class Store {
    private String storeName;
    private int storeId  ;
    private ArrayList<Items> storeItems = new ArrayList<>();

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

    public ArrayList<Items> getStoreItems() {
        return storeItems;
    }
    public void addStoreItem(Items items){
        storeItems.add(items);
    }
    public void setStoreItems(ArrayList<Items> storeItems) {
        this.storeItems = storeItems;
    }

    public void printStore() {
        System.out.println("Store Name: " + this.storeName);
        System.out.println("Id: " + this.storeId);

        if (this.storeItems.size() >0) {
            System.out.println("The items in stock\n");
            for(Items items : storeItems ) {
                System.out.println("Item Name: " + items.getName());
                System.out.println("Item Id: " + items.getId());
                System.out.println("Item cost: " + items.getCost() + "\n");
            }
        }
        else{
            System.out.println("Out of Stock");
        }

    }
}
