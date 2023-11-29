package com;

public class StringConversionExample {
	
	public static void main(String[] args) {
        // Creating Strings
        String str1 = "Hello";
        String str2 = "World";

        // Verifying Strings
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Converting Strings to StringBuffer and StringBuilder
        StringBuffer stringBuffer = new StringBuffer(str1);
        StringBuilder stringBuilder = new StringBuilder(str2);

        // Modifying StringBuffer and StringBuilder
        stringBuffer.append(" Java");
        stringBuilder.append("!");

        // Displaying modified StringBuffer and StringBuilder
        System.out.println("StringBuffer after modification: " + stringBuffer);
        System.out.println("StringBuilder after modification: " + stringBuilder);
    }

}
