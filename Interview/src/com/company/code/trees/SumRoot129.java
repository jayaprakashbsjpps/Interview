package com.jayaprakash.trees;

public class SumRoot129 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.right = new TreeNode(0);
        root.left.left = null;
        root.left.right = new TreeNode(1);
        //root.right.right = new Node(6);
        System.out.println(sumNumbers(root));
    }

    public static int sumNumbers(TreeNode root) {

        if(root==null) {
            return -1;
        }

        return helper(root,0);
    }

    static int helper(TreeNode root, int sum) {
        if(root==null) {
            return 0;
        }

        sum = sum * 10 + root.val;
        if(root.left==null && root.right==null) {
            return sum;
        }

        int left = helper(root.left,sum);
        int right = helper(root.right,sum);
        return left+right;
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
