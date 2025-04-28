package com.jayaprakash.trees;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {

    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        // Function call
        System.out.println("Postorder traversal of binary tree is: ");
        List<Integer> list = inorderTraversal(root);
        System.out.println(list);
    }


    public static  List<Integer> inorderTraversal(Node root) {

        List<Integer> list = new ArrayList<>();
        return inorderTraversal(root,list);

    }

    private static List<Integer> inorderTraversal(Node node, List<Integer> list) {

        if(node==null) {
            return list;
        }

        list=inorderTraversal(node.left,list);
        list.add(node.val);
        list=inorderTraversal(node.right,list);
        return list;
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
