package org.example.Week12.Lectures;

public class CounterMultithreaded implements Runnable{

    private int threadNumber;

    public CounterMultithreaded(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + "from thread " + this.threadNumber);
        }

        try {
            Thread.sleep(1000);
            //.sleep(milliseconds: long) method that pauses the thread for specified number of milliseconds so we can see the thread execution process
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}


class CounterSync {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return this.count;
    }
}

class SyncronizationExample {
    public static void main(String[] args) {

    CounterSync counter = new CounterSync();

    Thread t1 = new Thread(() -> {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    });

    Thread t2 = new Thread(() -> {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    });

    t1.start();
    t2.start();

    try {
        t1.join();
        //The join() method causes the current thread (the one on which join() is called) to wait until the thread
        // it is called on (the thread being joined) completes its execution.
        //The join() method is particularly useful in scenarios where you have multiple threads running concurrently,
        // and you want one thread to wait for another thread to complete its execution before proceeding.


        t2.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println("Count: " + counter.getCount());

    }
}
