package com.jayaprakash.instabyte100;

public class ValidateBST98 {
    static boolean isVailid=true;
    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);

        node1.left=node2;
        node1.right=node3;

        System.out.println(isValidBST(node1));

    }

    public static boolean isValidBST(TreeNode root) {

        return validate(root,null,null);

    }

    static boolean validate(TreeNode node,Integer min,Integer max) {

        if(node==null) {
            return true;
        }

        if((min!=null && node.val<=min)||(max!=null && node.val>=max)) {
            return false;
        }

        return validate(node.left,min,node.val) && validate(node.right,node.val,max);
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
