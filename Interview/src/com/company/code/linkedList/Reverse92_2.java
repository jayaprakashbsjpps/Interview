package com.jayaprakash.linkedList;

public class Reverse92_2 {

    public static void main(String[] args) {

//        ListNode node3= new ListNode(5);
//        ListNode node2= new ListNode(4,node3);
//        ListNode node1= new ListNode(3,node2);
//        ListNode node7= new ListNode(2,node1);
//        ListNode node8= new ListNode(1,node7);

        ListNode node3= new ListNode(5);
        ListNode node2= new ListNode(3,node3);

        display(node2);
        ListNode node9= reverseBetween(node2,1,2);
        display(node9);
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {

        if(head==null || head.next==null) {

            return head;
        }

        if(left==right) {
            return head;
        }

        ListNode current = head;
        ListNode prev=null;

        for (int i = 0;current!=null && i < left-1; i++) {
                prev=current;
                current=current.next;
        }

        ListNode last=prev;
        ListNode newEnd=current;

        //reverse between left and right
        ListNode next= current.next;
        for (int i = left; current!=null &&  i<= right-left +1; i++) {

            current.next=prev;
            prev=current;
            current=next;
            if(next!=null) {
                next=next.next;
            }
        }

        if(last!=null) {
            last.next=prev;
        } else {
            head=prev;
        }

        newEnd.next=current;

        return head;

    }

    public static ListNode reverseList(ListNode last,ListNode start,ListNode end) {

        ListNode previous=null;
        ListNode present=start;
        ListNode next=present.next;
        ListNode tail= end;

        while(last.next!=null) {

            last=last.next;
        }

        System.out.println(last.val);
        
        while(present!=tail) {

            present.next=previous;
            previous=present;
            present=next;

            if(next!=null) {

                next=next.next;
            }


        }

        start.next=last;

        tail.next=previous;
        return tail;

    }
    public static void display(ListNode node) {

        ListNode temp = node;

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
