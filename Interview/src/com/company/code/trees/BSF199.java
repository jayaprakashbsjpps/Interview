package com.jayaprakash.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BSF199 {
    public static void main(String[] args) {

    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root==null) {
            return result;
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
            result.add(currentLevelList.getLast());

        }
        return result;
    }
}
