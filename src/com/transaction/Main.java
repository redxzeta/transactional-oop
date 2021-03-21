package com.transaction;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Store bestBuy = new Store("Best Buy", 1);
        bestBuy.printStore();
        Store circuitCity = new Store("Circuit City", 2);
        circuitCity.printStore();
        Food banana = new Food(1,"banana", 3.20, 1,"Dole");
        banana.totalCost();
        bestBuy.weclomeMethod();
        bestBuy.farewellMethod();
        circuitCity.weclomeMethod();
        circuitCity.farewellMethod();
    }


}
