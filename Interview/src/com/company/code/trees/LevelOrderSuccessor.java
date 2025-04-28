package com.jayaprakash.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderSuccessor {

    public static void main(String[] args) {

    }

    public TreeNode levelOrderSuccessor(TreeNode root, int key) {

        if(root==null) {
            return root;
        }
        TreeNode result = new TreeNode();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()) {

            TreeNode currentNode= queue.poll();

            if(currentNode.left!=null) {
                queue.offer(currentNode.left);
            }

            if(currentNode.right!=null) {
                queue.offer(currentNode.right);
            }

            if(currentNode.val==key) {
                break;
            }

        }
        result=queue.poll();

        return result;

    }
}
