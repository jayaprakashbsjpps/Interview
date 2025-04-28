package com.jayaprakash.linkedList;

public class Reverse206 {

    public static void main(String[] args) {

        ListNode node3= new ListNode(5);
        ListNode node2= new ListNode(4,node3);
        ListNode node1= new ListNode(3,node2);
        ListNode node7= new ListNode(2,node1);
        ListNode node8= new ListNode(1,node7);

        display(node8);
        ListNode node9= reverseList(node8);
        display(node9);

    }




    public static ListNode reverseList(ListNode head) {


        if(head==null || head.next==null) {

            return head;
        }
        ListNode reverseList = new ListNode();
        ListNode fourth= reverseList;

        ListNode first = head.next;
        ListNode third=head;

        ListNode second = head;

        while(third!=null && third.next!=null) {
            while(first.next!=null) {

                first=first.next;
                second=second.next;

            }

            second.next=null;
            reverseList.next=first;
            reverseList=reverseList.next;

            first=head.next;
            second=head;
            third=head;

            third=third.next;

        }

        return fourth.next;


    }

    public static ListNode reverseInPlace(ListNode head) {

        if(head==null || head.next==null) {

            return head;
        }

        ListNode previous=null;
        ListNode present=head;
        ListNode next= present.next;

        while(present!=null) {

            present.next=previous;
            previous=present;
            present=next;

            if(next!=null) {

                next=next.next;
            }

        }

        return previous;
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
