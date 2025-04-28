package com.jayaprakash.threads;

public class SuspendResume {

    public static void main(String[] args) {

        NewThread ob1=new NewThread("One");
        NewThread ob2 = new NewThread("Two");

        ob1.t.start();
        ob2.t.start();

        try{
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Suspending thread one");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Resuming thread one");
            ob2.mysuspend();
            System.out.println("Suspending thread two");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Resuming thread Two");
        }catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        try{
            System.out.println("Waiting for threads to finish");
            ob1.t.join();
            ob2.t.join();

            System.out.println("Main thread exiting");
        }catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
    }
}
