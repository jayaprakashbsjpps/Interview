package com.jayaprakash.linkedList;

public class SortList148 {


    public static void main(String[] args) {

        ListNode node3= new ListNode(5);
        ListNode node2= new ListNode(4,node3);
        ListNode node1= new ListNode(3,node2);
        ListNode node5= new ListNode(2,node1);
        ListNode node4= new ListNode(1,node5);


        //display(sortList(node4));
    }

//    public static ListNode sortList(ListNode head) {
//
//    }

    public static void display(ListNode head) {

        ListNode temp = head;

        while(temp!=null) {
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }

        System.out.println("END");
    }
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
