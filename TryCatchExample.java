package com;

public class TryCatchExample {
	
	public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Code to handle the exception
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // Code that will always be executed, regardless of whether an exception occurred or not
            System.out.println("Program execution complete.");
        }
    }

    public static int divideNumbers(int dividend, int divisor) {
        // This method throws an ArithmeticException if the divisor is zero
        return dividend / divisor;
    }

}
