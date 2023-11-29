package com;

public class OuterClass {
	
	 // Member variables or methods of the outer class

    // Inner class
    class InnerClass {
        // Member variables or methods of the inner class
    }

    // Static inner class
    static class StaticInnerClass {
        // Member variables or methods of the static inner class
    }

    // Main method to test inner classes
    public static void main(String[] args) {
        // Create an instance of the outer class
        OuterClass outer = new OuterClass();

        // Create an instance of the inner class using the outer class instance
        InnerClass inner = outer.new InnerClass();

        // Create an instance of the static inner class directly
        StaticInnerClass staticInner = new StaticInnerClass();
    }

}
