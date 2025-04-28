package com.jayaprakash.trees;

import java.util.*;

public class BSF102 {

    public static void main(String[] args) {

        Object[] arr= new Object[]{3,9,20,null,null,15,7};
        TreeNode root = new TreeNode((int)arr[0]);
        TreeNode left=null;
        TreeNode right=null;

        for (int i = 1; i < arr.length; i++) {

            if(arr[i]!=null) {
                left = new TreeNode((int)arr[i]);
            }else {
                left = null;
            }

            if(arr[i+1]!=null) {
                right = new TreeNode((int)arr[i+1]);
            }else {
                right = null;
            }
            root.left=left;
            root.right=right;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) {
            return ans;
        }

        Queue<TreeNode> queue= new LinkedList<TreeNode>();
        queue.offer(root);

        while(!queue.isEmpty()) {

            int levelSize = queue.size();

            List<Integer> currentLevelList = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {

               TreeNode currentNode = queue.poll();
                currentLevelList.add(currentNode.val);
               if(currentNode.left!=null) {
                    queue.offer(currentNode.left);
               }
                if(currentNode.right!=null) {
                    queue.offer(currentNode.right);
                }

            }
            ans.add(currentLevelList);

        }
        return ans;
    }

}

class TreeNode {
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
