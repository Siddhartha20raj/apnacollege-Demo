package com;

public class ExceptionHandlingDemo {
	
	public static void main(String[] args) {
        try {
            // Code that might throw exceptions
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the specific exception
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions
            System.err.println("Unexpected error: " + e.getMessage());
        } finally {
            // Code to be executed regardless of whether an exception occurred or not
            System.out.println("Finally block executed");
        }
    }

    public static int divideNumbers(int numerator, int denominator) {
        // Method that might throw an exception
        return numerator / denominator;
    }
}
