package com.jayaprakash.linkedList;

public class LL148MergeSort {


    public static void main(String[] args) {


        ListNode node3= new ListNode(1);
        node3.next=null;
        ListNode node2= new ListNode(2,node3);
        ListNode node1= new ListNode(3,node2);
        ListNode node5= new ListNode(4,node1);
        ListNode node4= new ListNode(5,node5);

        ListNode head= node4;


        // display(node4);

         //display(sortList(head));
    }

    public ListNode sortList(ListNode head) {


        if(head==null || head.next==null) {
            return head;
        }
        ListNode mid= getMiddle(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left,right);

    }

    static ListNode getMiddle(ListNode head) {


        ListNode midPrev = null;

        while(head!=null && head.next!=null) {

            midPrev = (midPrev==null) ? head: midPrev.next;
            head= head.next.next;
        }
        ListNode mid=midPrev.next;
        midPrev.next=null;
        return mid;

    }

    static ListNode merge(ListNode first,ListNode second) {

        ListNode dummyHead = new ListNode();

        ListNode tail= dummyHead;

        while(first!=null && second!=null) {

            if(first.val<second.val) {

                tail.next= first;
                first=first.next;
                tail=tail.next;
            } else {

                tail.next= second;
                second=second.next;
                tail=tail.next;

            }
        }

        if(first!=null) {

            tail.next=first;
        }

        if(second!=null) {
            tail.next=second;
        }

        return dummyHead.next;

    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
