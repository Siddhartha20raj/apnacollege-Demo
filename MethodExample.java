package com;

public class MethodExample {
	
	 // Method with no parameters and no return value
    public void sayHello() {
        System.out.println("Hello, World!");
    }

    // Method with parameters and a return value
    public int addNumbers(int a, int b) {
        return a + b;
    }

    // Method with a default value for a parameter
    public void greetUser(String name, String greeting) {
        System.out.println(greeting + ", " + name + "!");
    }

    // Main method to demonstrate method calls
    public static void main(String[] args) {
        // Creating an instance of the class
        MethodExample example = new MethodExample();

        // Calling a method with no parameters and no return value
        example.sayHello();

        // Calling a method with parameters and capturing the return value
        int sum = example.addNumbers(5, 7);
        System.out.println("Sum: " + sum);

        // Calling a method with default parameter values
        example.greetUser("Alice", "Hi");

        // Calling a method using the class instance (for non-static methods)
        example.sayHello();

        // Calling a static method without creating an instance
        staticMethod();
    }

    // Static method (can be called without creating an instance)
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

}
