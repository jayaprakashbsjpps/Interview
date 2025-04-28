package com.jayaprakash.trees;

public class LCA236 {

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
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.right= new TreeNode(4);
        root.left.right.left= new TreeNode(7);
        root.right.right = new TreeNode(8);
        root.right.left = new TreeNode(0);

        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(8);

        TreeNode ans = lowestCommonAncestor(root, p, q);
        System.out.println(ans.val);

    }

    public static TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {

        if(node==null) {
            return null;
        }
        if((node.val==p.val) || (node.val==q.val)) {
            return node;
        }

        TreeNode left = lowestCommonAncestor(node.left,p,q);
        TreeNode right = lowestCommonAncestor(node.right,p,q);

        if(left!=null && right!=null) {
            return node;
        }

        return left==null ? right:left;
    }
}
