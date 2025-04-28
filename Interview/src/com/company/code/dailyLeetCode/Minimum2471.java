package com.jayaprakash.dailyLeetCode;

import java.util.*;

public class Minimum2471 {

    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(7);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(8);
        TreeNode node7 = new TreeNode(5);

        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=node6;
        node3.right=node7;

        System.out.println(minimumOperations(node1));

    }

    public static int minimumOperations(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int minSwap=0;

        while(!queue.isEmpty()) {

            List<TreeNode> currentLevel = new ArrayList<>();
            int listSize = queue.size();
            for(int i=0;i<listSize;i++) {

                TreeNode node = queue.poll();
                currentLevel.add(node);

                if(node.left!=null) {
                    queue.offer(node.left);
                }
                if(node.right!=null) {
                    queue.offer(node.right);
                }
            }
            int[] arr = currentLevel.stream().mapToInt(t->t.val).toArray();

            minSwap = minSwapReq(arr);

        }
        return minSwap;
    }

    static int minSwapReq(int[] arr) {

       Map<Integer,Integer> map = new HashMap<>();
       int[] temp = arr.clone();
       Arrays.sort(temp);

        for (int i = 0; i < arr.length; i++) {
            map.put(temp[i],i);
        }

        int ans=0;
        for (int i = 0; i < arr.length;) {
            int ind = map.get(arr[i]);
            if(ind==i) {
                i++;
            }else {
                int tmp = arr[i];
                arr[i]=arr[ind];
                arr[ind]=tmp;
                ans++;
            }
        }

        return ans;
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
