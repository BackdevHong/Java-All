package org.example.counter;

public class Counter implements Runnable {
    private int count = 0;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        this.increment();
        System.out.println("value for Thread after increment " + Thread.currentThread().getName() + " " + this.getCount());
        this.decrement();
        System.out.println("Value for Thread at last" + Thread.currentThread().getName() + " " + this.getCount());
    }
}
