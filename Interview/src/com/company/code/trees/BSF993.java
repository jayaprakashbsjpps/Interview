package com.jayaprakash.trees;

public class BSF993 {


    public boolean isCousins(TreeNode root, int x, int y) {

        TreeNode xx= findNode(root,x);
        TreeNode yy= findNode(root,y);

        return(

                (level(root,xx,0) ==level(root,yy,0) && (!isSiblings(root,xx,yy)))
                );

    }

    public static TreeNode findNode(TreeNode root,int x) {
        if(root==null) {
            return null;
        }

        if(root.val==x) {
            return root;
        }

        TreeNode n= findNode(root.left,x);
        if(n!=null) {
            n= findNode(root.right,x);
        }

        return n;
    }

    public static int level(TreeNode node,TreeNode xx,int level) {
        if(node==null) {
            return 0;
        }

        if(node==xx) {
            return level;
        }

        int l = level(node.left,xx,level+1);
        if(l!=0) {
            return l;
        }
        return level(node.right,xx,level+1);
    }

    public static boolean isSiblings(TreeNode node,TreeNode xx,TreeNode yy) {

        if(node==null) {
            return false;
        }

        return (
                (node.left ==xx && node.right==yy) || (node.left ==yy && node.right==xx)
                || isSiblings(node.left,xx,yy) || isSiblings(node.right,xx,yy)
                );

    }
}
