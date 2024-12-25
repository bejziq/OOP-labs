package org.example.Week12.Lectures;

public class Counter implements Runnable{
    private int numberOfThreads;

    public Counter(int numberOfThreads) {
        this.numberOfThreads = numberOfThreads;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + "from thread " + this.numberOfThreads);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Counter ct = new Counter(i);

            Thread thread = new Thread(ct);
            thread.start();
        }

    }
}
