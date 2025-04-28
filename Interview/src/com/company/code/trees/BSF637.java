package com.jayaprakash.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BSF637 {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        if(root==null) {

            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()) {

            int levelSize = queue.size();
            long sum=0;

            for(int i=0;i<levelSize;i++) {

                TreeNode currentNode= queue.poll();

                if(currentNode.left!=null) {
                    queue.offer(currentNode.left);
                }

                if(currentNode.right!=null) {
                    queue.offer(currentNode.right);
                }

                sum+=currentNode.val;
            }

            result.add((double)sum/levelSize);

        }

        return result;

    }

}



