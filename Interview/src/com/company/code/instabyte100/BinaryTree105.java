package com.jayaprakash.instabyte100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BinaryTree105 {

    static private Map<Integer,Integer> inorderIndexMap;
    static int preorderIndex;

    public static TreeNode buildTreeTraversal(int[] preorder, int[] inorder) {

        inorderIndexMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i],i);
        }

        preorderIndex = 0;
        return buildTreeHelper(preorder, 0, inorder.length - 1);
    }

   static TreeNode buildTreeHelper(int[] preorder,int inorderStart,int inorderEnd) {

        if(inorderStart>inorderEnd) {
            return null;
        }

        // Get the current root value from preorder traversal
        int rootValue = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootValue);

        // Get the index of the root value in inorder traversal
        int inorderIndex = inorderIndexMap.get(rootValue);

        // Recursively build the left and right subtrees
        root.left = buildTreeHelper(preorder, inorderStart, inorderIndex - 1);
        root.right = buildTreeHelper(preorder, inorderIndex + 1, inorderEnd);

        return root;
    }

    public  static TreeNode buildTree(int[] preorder, int[] inorder) {

        if(preorder.length==0) {
            return null;
        }
        int r=preorder[0];
        int index=0;

        for (int i = 0; i < inorder.length; i++) {

             if(r==inorder[i]) {
                index=i;
             }
        }
        TreeNode node = new TreeNode(r);
        node.left=buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
        node.right=buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));

        return node;
    }


    public static void main(String[] args) {

        int[] preorder = {3,9,20,15,7};
        int[] inorder ={9,3,15,20,7};

       // System.out.println(buildTree(preorder,inorder));
        buildTreeTraversal(preorder,inorder);
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
