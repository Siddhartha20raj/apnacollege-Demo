package com;

import java.util.HashMap;
import java.util.Map;

public class CountryCapitalMap {
	
	public static void main(String[] args) {
        // Create a Map to store the mapping between countries and their capitals
        Map<String, String> countryCapitalMap = new HashMap<>();

        // Add country-capital pairs to the map
        countryCapitalMap.put("USA", "Washington D.C.");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("UK", "London");
        countryCapitalMap.put("France", "Paris");

        // Display the map of countries and their capitals
        System.out.println("Country-Capital Map:");
        for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
