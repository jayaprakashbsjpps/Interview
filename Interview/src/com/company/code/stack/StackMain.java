package com.jayaprakash.stack;

public class StackMain {

    public static void main(String[] args) throws StackException {
//        CustomStack stack = new CustomStack(5);
        CustomStack stack = new DynamicStack(5);

                stack.push(34);
                stack.push(45);
                stack.push(2);
                stack.push(9);
                stack.push(18);
        stack.push(25);
        stack.push(90);
//                System.out.println(stack.pop());
//                System.out.println(stack.pop());
//                System.out.println(stack.pop());

    }
}
