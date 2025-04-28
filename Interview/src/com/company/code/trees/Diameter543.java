package com.jayaprakash.trees;

import java.util.ArrayList;
import java.util.List;

public class Diameter543 {
    static int diameter=0;
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        //root.right.right = new Node(6);

        // Function call
        System.out.println("Postorder traversal of binary tree is: ");
        int val= diameterOfBinaryTree(root);
        System.out.println(val);
    }

    public static int diameterOfBinaryTree(Node root) {

        calculateDepth(root);
        return diameter;

    }

    public static int calculateDepth(Node node) {

            if(node==null) {
                return 0;
            }

            int leftDepth = calculateDepth(node.left);
            int rightDepth = calculateDepth(node.right);

            diameter = Math.max(diameter,leftDepth+rightDepth);

            return Math.max(leftDepth,rightDepth)+1;
    }


    static class Node {
        int val;
        Node left, right;
        Node(int v)
        {
            val = v;
            left = right = null;
        }
    }
}
