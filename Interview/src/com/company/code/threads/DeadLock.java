package com.jayaprakash.threads;

class A {

    synchronized void foo(B b) {

        String name= Thread.currentThread().getName();
        System.out.println(name+" Entered A.foo");

        try {
            Thread.sleep(1000);
        }catch (Exception e) {
            System.out.println("A Interrupted");
        }

        System.out.println(name+" trying to call B.last");
        b.last();
    }

    synchronized void last() {
        System.out.println("Inside A.last");
    }
}

class B {

    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name+" entered B.bar");

        try {

        }catch (Exception e) {
            System.out.println("B Interrupted");
        }

        System.out.println(name+ " trying to call A.last()");
        a.last();

    }

    synchronized void last() {
        System.out.println("Inside B.last");
    }

}

public class DeadLock implements Runnable{

    A a = new A();
    B b = new B();
    Thread t;

    DeadLock() {
       Thread.currentThread().setName("Main thread");
       t=new Thread(this,"Racing thread");
    }

    void deadLockStart() {
        t.start();
        a.foo(b);
        System.out.println("Back in main thread");
    }
    @Override
    public void run() {
        b.bar(a);
        System.out.println("Back in other thread");
    }

    public static void main(String[] args) {
        DeadLock d1=new DeadLock();
        d1.deadLockStart();
    }
}


