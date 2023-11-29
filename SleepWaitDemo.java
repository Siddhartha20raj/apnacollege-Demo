package com;

public class SleepWaitDemo {
	
	 private static final Object lock = new Object();

	    public static void main(String[] args) {
	        // Create and start two threads
	        Thread thread1 = new Thread(new Sleeper(), "Thread 1");
	        Thread thread2 = new Thread(new Waiter(), "Thread 2");

	        thread1.start();
	        thread2.start();
	    }

	    // Sleeper thread sleeps for 2 seconds
	    static class Sleeper implements Runnable {
	        @Override
	        public void run() {
	            synchronized (lock) {
	                System.out.println(Thread.currentThread().getName() + " is going to sleep.");
	                try {
	                    Thread.sleep(2000); // Sleep for 2 seconds
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	                System.out.println(Thread.currentThread().getName() + " woke up.");
	            }
	        }
	    }

	    // Waiter thread waits for notification
	    static class Waiter implements Runnable {
	        @Override
	        public void run() {
	            synchronized (lock) {
	                System.out.println(Thread.currentThread().getName() + " is waiting.");
	                try {
	                    lock.wait(); // Waits for notification
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	                System.out.println(Thread.currentThread().getName() + " received notification and completed.");
	            }
	        }
	    }
}
