package com;

import java.util.Scanner;

public class EmailSearchProgram {
	
	public static void main(String[] args) {
        // Array of email IDs
        String[] emailIds = {
            "john.doe@example.com",
            "jane.smith@example.com",
            "bob.jones@example.com",
            // Add more email IDs as needed
        };

        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an email ID
        System.out.print("Enter an email ID to search: ");
        String searchEmail = scanner.nextLine();

        // Call the method to search for the entered email ID
        boolean isEmailFound = searchEmailId(emailIds, searchEmail);

        // Display the result based on whether the email ID was found or not
        if (isEmailFound) {
            System.out.println("Email ID found in the array.");
        } else {
            System.out.println("Email ID not found in the array.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Method to search for an email ID in the array
    private static boolean searchEmailId(String[] emailIds, String searchEmail) {
        for (String email : emailIds) {
            // Use equalsIgnoreCase to perform case-insensitive comparison
            if (email.equalsIgnoreCase(searchEmail)) {
                return true; // Email ID found
            }
        }
        return false; // Email ID not found
    }

}
