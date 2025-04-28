package com.jayaprakash.threads;

public class NewThread implements  Runnable{
    String name;
    Thread t;
    boolean suspendFlag;

    NewThread() {

    }
    NewThread(String threadName) {
        name=threadName;
        t= new Thread(this,threadName);
        System.out.println("New thread "+t);
        suspendFlag=false;
    }

    public void run() {

        try {

            for (int i = 15; i >0 ; i--) {
                System.out.println(name+ ": "+i);
                Thread.sleep(200);
                synchronized (this) {
                    while(suspendFlag) {
                        wait();
                    }
                }
            }  
        }catch (InterruptedException e) {
            System.out.println(name+"Interrupted");
        }
        System.out.println(name+" exiting");
    }

    public static NewThread createAndStart() {
        NewThread myThrd = new NewThread("New thread");
        myThrd.t.start();
        return myThrd;
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}
