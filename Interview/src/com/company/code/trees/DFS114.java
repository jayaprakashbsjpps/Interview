package com.jayaprakash.trees;

public class DFS114 {

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

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(6);
        root.left.right = new TreeNode(4);

        flatten(root);
    }

    public static void flatten(TreeNode root) {

        TreeNode current = root;

        while(current!=null) {

            if(current.left!=null) {
                TreeNode temp = current.left;
                while(temp.right!=null) {
                    temp=temp.right;
                }

                temp.right=current.right;
                current.right = current.left;
                current.left=null;
            }
            current=current.right;
        }
    }
}
