package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexVerifier {
	
	public static void main(String[] args) {
        // Test regular expressions against input strings
        testRegularExpression("abc", "abc"); // Example 1
        testRegularExpression("\\d{3}-\\d{2}-\\d{4}", "123-45-6789"); // Example 2
        testRegularExpression("[A-Za-z]+", "HelloWorld"); // Example 3
        // Add more test cases as needed
    }

    private static void testRegularExpression(String regex, String input) {
        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher that will match the given input against the pattern
        Matcher matcher = pattern.matcher(input);

        // Perform the matching and print the result
        if (matcher.matches()) {
            System.out.println("Pattern '" + regex + "' matches input '" + input + "'");
        } else {
            System.out.println("Pattern '" + regex + "' does not match input '" + input + "'");
        }
    }

}
