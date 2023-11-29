package com;

public class TypeCastingExample {
	
	public static void main(String[] args) {
        // Implicit Type Casting (Widening)
        int intValue = 10;
        long longValue = intValue; // Implicit casting from int to long
        float floatValue = longValue; // Implicit casting from long to float
        System.out.println("Implicit Type Casting:");
        System.out.println("int to long: " + longValue);
        System.out.println("long to float: " + floatValue);

        // Explicit Type Casting (Narrowing)
        double doubleValue = 45.67;
        int newIntValue = (int) doubleValue; // Explicit casting from double to int
        System.out.println("\nExplicit Type Casting:");
        System.out.println("double to int: " + newIntValue);
	}

}
