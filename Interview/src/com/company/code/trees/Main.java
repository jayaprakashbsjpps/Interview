package com.jayaprakash.trees;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(scanner);
       // tree.display();
        //tree.prettyDisplay();

//        BST tree=new BST();
//        tree.populate(new int[] {5,2,7,1,4,6,9,8,3,10});
//        tree.populateSorted(new int[] {1,2,3,4,5,6,7,8,9,10});
//        tree.display();
//        tree.preOrder();

//        Tree2AVL tree= new Tree2AVL();
//
//        for (int i = 0; i < 1000; i++) {
//            tree.insert(i);
//
//        }
//
//        System.out.println(tree.height());


            int[] arr={3,8,6,7,-2,-8,4,9};


            SegmentTree tree= new SegmentTree(arr);
            //tree.display();
        System.out.println(tree.query(1, 6));
    }
}
