package com;

import java.util.Arrays;


public class ArrayVerification {
	
	public static void main(String[] args) {
        // Create an array
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Verify array implementation by calculating the sum
        int sum = calculateSum(numbers);
        System.out.println("Sum of array elements: " + sum);

        // Verify array implementation by sorting
        int[] sortedArray = sortArray(numbers.clone());
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }

    // Method to calculate the sum of array elements
    private static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Method to sort an array
    private static int[] sortArray(int[] array) {
        Arrays.sort(array);
        return array;
    }

}
