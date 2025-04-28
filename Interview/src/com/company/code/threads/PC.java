package com.jayaprakash.threads;

public class PC {

    public static void main(String[] args) {

        Q q = new Q();

        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.t.start();
        c.t.start();

        System.out.println("Press control c to stop");
    }
}

class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();  // Wait until a value is produced.
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception caught");
            }
        }
        System.out.println("Got: " + n);
        valueSet = false;
        notify();  // Notify the producer to produce the next value.
        return n;
    }

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();  // Wait if the consumer hasn't consumed the value.
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception caught");
            }
        }
        this.n = n;
        System.out.println("Put: " + n);
        valueSet = true;
        notify();  // Notify the consumer to consume the value.
    }
}

class Producer implements Runnable {
    Q q;
    Thread t;

    Producer(Q q) {
        this.q = q;
        t = new Thread(this, "Producer");
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;
    Thread t;

    Consumer(Q q) {
        this.q = q;
        t = new Thread(this, "Consumer");
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}
