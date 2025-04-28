package com.jayaprakash.instabyte100;

public class FlattenBinary114 {

    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6= new TreeNode(6);

        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.right=node6;

        flatten(node1);
    }

    public static void flatten(TreeNode root) {

        TreeNode current = root;
        while(current!=null) {

            if(current.left!=null) {
                TreeNode temp=current.left;
                while(temp.right!=null) {
                    temp=temp.right;
                }

                temp.right=current.right;
                current.right=current.left;
                current.left=null;
            }
            current=current.right;
        }

    }

static class TreeNode {
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
