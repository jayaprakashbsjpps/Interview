package com.jayaprakash.trees;

public class SortedArray108 {


    public static void main(String[] args) {

        int[] nums={-10,-3,0,5,9};
        buildBST(nums,0,nums.length-1);

    }

    private static TreeNode buildBST(int[] nums,int left,int right) {

        if(left>right) {
            return null;
        }

        int mid = left + (right-left)/2;

        TreeNode node = new TreeNode(nums[mid]);
        node.left= buildBST(nums,left,mid-1);
        node.right= buildBST(nums,mid+1,right);

        return node;

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
