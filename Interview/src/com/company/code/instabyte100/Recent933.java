package com.jayaprakash.instabyte100;

import java.util.LinkedList;
import java.util.Queue;

public class Recent933 {

    private static Queue<Integer> queue;
    public static void main(String[] args) {

        Recent933 recent= new Recent933();
        System.out.println(recent.ping(1));
        System.out.println(recent.ping(100));
        System.out.println(recent.ping(3001));
        System.out.println(recent.ping(3002));

    }
    public Recent933() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while(queue.peek()<(t-3000)) {
            queue.poll();
        }
        return queue.size();
    }
}
