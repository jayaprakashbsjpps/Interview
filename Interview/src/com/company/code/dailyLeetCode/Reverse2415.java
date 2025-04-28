package com.jayaprakash.dailyLeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Reverse2415 {

    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(8);
        TreeNode node5 = new TreeNode(13);
        TreeNode node6 = new TreeNode(21);
        TreeNode node7 = new TreeNode(34);

        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=node6;
        node3.right=node7;


//        TreeNode node1 = new TreeNode(0);
//        TreeNode node2 = new TreeNode(1);
//        TreeNode node3 = new TreeNode(2);
//        TreeNode node4 = new TreeNode(0);
//        TreeNode node5 = new TreeNode(0);
//        TreeNode node6 = new TreeNode(0);
//        TreeNode node7 = new TreeNode(0);
//
//        TreeNode node8 = new TreeNode(1);
//        TreeNode node9 = new TreeNode(1);
//        TreeNode node10 = new TreeNode(1);
//        TreeNode node11 = new TreeNode(1);
//
//        TreeNode node12 = new TreeNode(2);
//        TreeNode node13 = new TreeNode(2);
//        TreeNode node14 = new TreeNode(2);
//        TreeNode node15 = new TreeNode(2);
//
//        node1.left=node2;
//        node1.right=node3;
//        node2.left=node4;
//        node2.right=node5;
//        node3.left=node6;
//        node3.right=node7;
//        node4.left=node8;
//        node4.right=node9;
//        node5.left=node10;
//        node5.right=node11;
//
//        node6.left =node12;
//        node6.right=node13;
//        node7.left=node14;
//        node7.right=node15;

        TreeNode root = reverseOddLevels(node1);
    }

    public static TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level=0;
        while(!queue.isEmpty()) {
            int currentLevel = queue.size();
            List<TreeNode> currentList = new ArrayList<>();
            for(int i=0;i<currentLevel;i++) {

                TreeNode currentNode = queue.poll();
                currentList.add(currentNode);

                if(currentNode.left!=null) {
                    queue.offer(currentNode.left);
                }

                if(currentNode.right!=null) {
                    queue.offer(currentNode.right);
                }

            }
            level++;
            if(level%2==0) {

                int mid = currentList.size()/2;
                int low =0;
                while(low<currentList.size()/2) {

                    TreeNode first = currentList.get(low);
                    TreeNode second = currentList.get(mid);

                    int temp = first.val;
                    first.val=second.val;
                    second.val=temp;
                    low++;
                    mid++;

                }

            }

        }

        return root;
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
