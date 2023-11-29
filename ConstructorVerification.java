package com;

class MyClass {
    private int value;

    // Default constructor
    public MyClass() {
        this.value = 0;
    }

    // Parameterized constructor
    public MyClass(int value) {
        this.value = value;
    }

    // Copy constructor
    public MyClass(MyClass other) {
        this.value = other.value;
    }

    // Display method to print the value
    public void display() {
        System.out.println("Value: " + value);
    }
}

public class ConstructorVerification {
	
	public static void main(String[] args) {
        // Create objects using different constructors
        MyClass defaultConstructorObj = new MyClass();
        MyClass parameterizedConstructorObj = new MyClass(42);
        MyClass copyConstructorObj = new MyClass(parameterizedConstructorObj);

        // Display values
        System.out.println("Default Constructor:");
        defaultConstructorObj.display();

        System.out.println("\nParameterized Constructor:");
        parameterizedConstructorObj.display();

        System.out.println("\nCopy Constructor:");
        copyConstructorObj.display();
    }

}
