package com.transaction;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Store bestBuy = new Store("Best Buy", 1);
        Store circuitCity = new Store("Circuit City", 2);
        Store ralphs = new Store("Ralph's",3);
        Food banana = new Food(1,"banana", 3.20, 1,"Dole");
        Food tomato = new Food(2, "Tomato", 3.20, 2, "Street");
        Food peanuts = new Food(3, "Peanuts", 1.20, 10, "Skippy");
        Food chocolate = new Food(5,"Chocolate", 0.99, 59, "Hersheys");
        ralphs.addFoodItem(banana);
        ralphs.addFoodItem(tomato);
        ralphs.addFoodItem(peanuts);
        ralphs.addFoodItem(chocolate);
        ralphs.printStore();
        ralphs.removeFoodItem(0);
        ralphs.printStore();
        ralphs.removeFoodItem(peanuts);
        ralphs.printStore();

    }


}
