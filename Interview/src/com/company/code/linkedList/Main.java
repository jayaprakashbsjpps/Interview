package com.jayaprakash.linkedList;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LL linkedList = new LL();

        linkedList.insertFirst(5);
        linkedList.insertFirst(13);
        linkedList.insertFirst(8);
        linkedList.insertFirst(19);
        linkedList.insertLast(99);
        linkedList.insert(100,3);
        linkedList.display();
        System.out.println(linkedList.deleteFirst());
        linkedList.display();
        System.out.println(linkedList.deleteLast());
        linkedList.display();
       // System.out.println(linkedList.delete(2));
        linkedList.display();
        linkedList.insertRec(88,2);
        linkedList.display();

//        DLL linkedList = new DLL();
//
//
//        linkedList.insertFirst(5);
//        linkedList.insertFirst(13);
//        linkedList.insertFirst(8);
//        linkedList.insertFirst(19);
//        linkedList.insertAfter(8,65);
//
//        linkedList.insertLast(99);
//
//        linkedList.display();
//        linkedList.reverseDisplay();

//        CLL list=new CLL();
//        list.insert(23);
//        list.insert(3);
//        list.insert(19);
//        list.insert(75);
//        list.display();
//        list.delete(19);
//       list.display();




    }
}
