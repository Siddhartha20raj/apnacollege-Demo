package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileHandlingExample {
	
	public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";

        // Writing to a file
        writeToFile(filePath, "Hello, this is a sample text.");

        // Reading from a file
        String content = readFromFile(filePath);
        System.out.println("Content of the file: " + content);

        // Appending to a file
        appendToFile(filePath, "\nThis is an appended text.");

        // Reading the updated content
        content = readFromFile(filePath);
        System.out.println("Updated content of the file: " + content);
    }

    // Method to write content to a file
    private static void writeToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("Content successfully written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read content from a file
    private static String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    // Method to append content to a file
    private static void appendToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(content);
            System.out.println("Content successfully appended to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
