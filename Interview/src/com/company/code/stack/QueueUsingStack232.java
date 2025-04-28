package com.jayaprakash.stack;

import java.util.Stack;

public class QueueUsingStack232 {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack232() {

        first= new Stack<Integer>();
        second = new Stack<Integer>();
    }

    public void push(int x) {

        first.push(x);
    }

    public int pop() throws Exception{
        int removed=0;
        try {

            while(!first.isEmpty()) {
                second.push(first.pop());
            }
            removed = second.pop();

            while(!second.isEmpty()) {
                first.push(second.pop());
            }

            return removed;

        }catch(Exception e) {

            throw e;
        }

    }

    public int peek() {

        while(!first.isEmpty()) {
            second.push(first.pop());
        }
        int peekElement= second.peek();

        while(!second.isEmpty()) {
            first.push(second.pop());
        }

        return peekElement;
    }

    public boolean empty() {

        return first.isEmpty();
    }
}
