package com.jayaprakash.linkedList;

public class RotateList61 {

    public static void main(String[] args) {

//        ListNode node5= new ListNode(5);
//        ListNode node4= new ListNode(4,node5);
        ListNode node3= new ListNode(3);
        ListNode node2= new ListNode(2,node3);
        ListNode node1= new ListNode(1,node2);

        display(node1);
        ListNode reverse=rotateRight(node1,2000000000);
        display(reverse);
    }

    public static ListNode rotateRight(ListNode head, int k) {

        if(head==null || head.next==null) {
            return head;
        }

        int n = getLength(head);
        int rotate = k % n;


        for(int i=0;i<rotate;i++) {

            ListNode prev=null;
            ListNode present=head;
            ListNode next=present.next;

            while(present.next!=null) {
                prev=present;
                present=present.next;
                if(next!=null) {
                    next=next.next;
                }
            }

            prev.next=null;
            present.next=head;
            head=present;

        }

        return head;

    }

    public static int getLength(ListNode node) {

        int count=0;

        while(node!=null) {

            node=node.next;
            count++;
        }

        return count;
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
