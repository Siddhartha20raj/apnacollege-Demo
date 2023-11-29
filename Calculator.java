package com;
import java.util.Scanner;
public class Calculator {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Arithmetic Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = divide(num1, num2);
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please choose a number between 1 and 4.");
        }

        scanner.close();
    }

    // Method to perform addition
    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to perform subtraction
    private static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to perform multiplication
    private static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to perform division
    private static double divide(double num1, double num2) {
        return num1 / num2;
    }

	
	

}
