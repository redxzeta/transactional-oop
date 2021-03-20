package com.transaction;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Items samsungTV = new Items(1, "Samsung TV", 32.64);
        Items lgTv = new Items(2, "Lg TV", 69.23);
        Store bestBuy = new Store("Best Buy", 1);
        bestBuy.addStoreItem(samsungTV);
        bestBuy.addStoreItem(lgTv);
        bestBuy.printStore();
        Store circuitCity = new Store("Circuit City", 2);
        circuitCity.printStore();


    }


}
