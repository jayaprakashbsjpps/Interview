package com.jayaprakash.threads;

public class DemoJoin {

    public static void main(String[] args) {

        NewThread nt1 = new NewThread("One");
        NewThread nt2 = new NewThread("Two");
        NewThread nt3 = new NewThread("Three");

        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        System.out.println("Thread One is alive "+nt1.t.isAlive());
        System.out.println("Thread One is alive "+nt2.t.isAlive());
        System.out.println("Thread One is alive "+nt3.t.isAlive());

        try{
            System.out.println("Waiting for main threads to finish");
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        }catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

    }
}
