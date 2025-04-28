package com.jayaprakash.threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {

    public static void main(String[] args) {

//        NewThread nt= new NewThread("new thread");
//
//        nt.t.start();

        NewThread nt=NewThread.createAndStart();

        try{
            for (int i = 5; i > 0; i--) {

                System.out.println("Main thread: "+i);
                Thread.sleep(1000);
            }
            
        }catch (InterruptedException e) {

        }

        List<Integer> list = new ArrayList<>();
    }
}
