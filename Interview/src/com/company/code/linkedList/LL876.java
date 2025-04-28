package com.jayaprakash.linkedList;

public class LL876 {

    public static void main(String[] args) {

        ListNode node3= new ListNode(5);
        ListNode node2= new ListNode(4,node3);
        ListNode node1= new ListNode(3,node2);
        ListNode node5= new ListNode(2,node1);
        ListNode node4= new ListNode(1,node5);


        display(middleNode(node4));


    }

    public static void display(ListNode head) {

        ListNode temp = head;

        while(temp!=null) {
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }

        System.out.println("END");
    }


    public static ListNode middleNode(ListNode head) {

        ListNode fast=head;
        ListNode second=head;

        if(fast==null || fast.next!=null) {
            return head;
        }


        while(fast.next!=null) {
            fast=fast.next.next;
            second=second.next;

        }

        return second;


    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
