package com.jayaprakash.trees;
import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {

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
        List<Integer> list = postorderTraversal(root);
        System.out.println(list);
    }


    public static  List<Integer> postorderTraversal(Node root) {

        List<Integer> list = new ArrayList<>();
        return postOrder(root,list);

    }

    private static List<Integer> postOrder(Node node, List<Integer> list) {

        if(node==null) {
            return list;
        }

        postOrder(node.left,list);
        postOrder(node.right,list);
        list.add(node.val);

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
