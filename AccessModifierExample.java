package com;

public class AccessModifierExample {
	
	public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Protected method accessible within the same package and subclasses
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    // Default (package-private) method accessible within the same package
    void defaultMethod() {
        System.out.println("This is a default (package-private) method.");
    }

    // Private method accessible only within the same class
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Main method to test the access modifiers
    public static void main(String[] args) {
        AccessModifierExample example = new AccessModifierExample();

        // Public method can be called from anywhere
        example.publicMethod();

        // Protected method can be called within the same package and subclasses
        example.protectedMethod();

        // Default (package-private) method can be called within the same package
        example.defaultMethod();

        // Private method can only be called within the same class
        example.privateMethod();
    }

}
