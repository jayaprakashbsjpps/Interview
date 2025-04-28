package com.jayaprakash.instabyte100;

import java.util.Stack;

public class MinStack155 {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    // Constructor
    public MinStack155() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push method
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    // Pop method
    public void pop() {
        if (!stack.isEmpty()) {
            if (stack.peek().equals(minStack.peek())) {
                minStack.pop();
            }
            stack.pop();
        }
    }

    // Top method
    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        throw new IllegalStateException("Stack is empty");
    }

    // getMin method
    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        throw new IllegalStateException("Min stack is empty");
    }

    public static void main(String[] args) {

        String[] op = {"MinStack","push","push","push","getMin","pop","top","getMin"};
        MinStack155 obj = new MinStack155();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        obj.pop();
        System.out.println(obj.getMin());
        System.out.println(obj.top());
        System.out.println(obj.getMin());

    }

}
