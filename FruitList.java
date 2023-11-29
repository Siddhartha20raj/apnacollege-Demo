package com;

import java.util.ArrayList;
import java.util.List;

public class FruitList {
	
	public static void main(String[] args) {
        // Create a List to store fruits
        List<String> fruitList = new ArrayList<>();

        // Add fruits to the list
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Orange");
        fruitList.add("Grapes");

        // Display the list of fruits
        System.out.println("List of Fruits:");
        for (String fruit : fruitList) {
            System.out.println(fruit);
        }
    }

}
