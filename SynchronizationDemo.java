package com;

class Counter {
    private int count = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        count++;
        System.out.println("Counter value: " + count + " | Thread: " + Thread.currentThread().getName());
    }

	public String getCount() {
		// TODO Auto-generated method stub
		return null;
	}
}

// Runnable class that increments the counter
class CounterIncrementer implements Runnable {
    private Counter counter;

    public CounterIncrementer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
        }
    }
}

// Main class to demonstrate thread synchronization

public class SynchronizationDemo {
	
	public static void main(String[] args) {
        // Create a shared counter
        Counter counter = new Counter();

        // Create two threads that increment the counter
        Thread thread1 = new Thread(new CounterIncrementer(counter), "Thread 1");
        Thread thread2 = new Thread(new CounterIncrementer(counter), "Thread 2");

        // Start the threads
        thread1.start();
        thread2.start();

        try {
            // Wait for threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display the final counter value
        System.out.println("Final Counter value: " + counter.getCount());
    }

}
