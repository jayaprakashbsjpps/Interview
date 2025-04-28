package com.jayaprakash.linkedList;

public class ReorderList143 {

    public static void main(String[] args) {

       // ListNode node3= new ListNode(5);
        ListNode node2= new ListNode(4);
        ListNode node1= new ListNode(3,node2);
        ListNode node7= new ListNode(2,node1);
        ListNode node8= new ListNode(1,node7);

        display(node8);
        reorderList(node8);
    }

    public static  void reorderList(ListNode head) {

//        if(head==null || head.next==null) {
//            return head;
//        }

        ListNode mid=getMiddle(head);
        System.out.println(mid.val);

        ListNode hs=reverseList(mid);

        ListNode hf=head;
        ListNode temp=null;

        System.out.println(hs.val);

        while(hf!=null && hs!=null) {

            temp=hf.next;
            hf.next=hs;
            hf=temp;

            temp=hs.next;
            hs.next=hf;
            hs=temp;

        }

        if(hf!=null) {
            hf.next=null;
        }

        display(head);

    }

    public static void display(ListNode node) {

        ListNode temp = node;

        while(temp!=null) {
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }

        System.out.println("END");
    }

    public static ListNode getMiddle(ListNode head) {

        ListNode first=head;
        ListNode second=head;

        while(first!=null && first.next!=null) {

            first=first.next.next;
            second=second.next;
        }

        return second;
    }

    public static ListNode reverseList(ListNode node) {


        ListNode prev=null;
        ListNode present=node;
        ListNode next=present.next;


        while(present!=null) {

            present.next=prev;
            prev=present;
            present=next;

            if(next!=null) {

                next=next.next;
            }
        }

        return prev;

    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
