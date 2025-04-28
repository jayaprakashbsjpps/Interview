package com.jayaprakash.instabyte100;

import java.util.*;

public class ZigZag103 {

    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);

        node1.left=node2;
        node1.right=node3;
        node3.left=node4;
        node3.right=node5;
       // [[3],[20,9],[15,7]]

        System.out.println(zigzagLevelOrder(node1));
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        boolean leftToRight = true;

        while (!deque.isEmpty()) {
            int levelSize = deque.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                if (leftToRight) {
                    // Remove from front if left-to-right
                    TreeNode currentNode = deque.pollFirst();
                    level.add(currentNode.val);

                    // Add children to the end of deque
                    if (currentNode.left != null) {
                        deque.offerLast(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        deque.offerLast(currentNode.right);
                    }
                } else {
                    // Remove from back if right-to-left
                    TreeNode currentNode = deque.pollLast();
                    level.add(currentNode.val);

                    // Add children to the front of deque
                    if (currentNode.right != null) {
                        deque.offerFirst(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        deque.offerFirst(currentNode.left);
                    }
                }
            }

            result.add(level);
            leftToRight = !leftToRight; // Toggle direction
        }

        return result;

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
