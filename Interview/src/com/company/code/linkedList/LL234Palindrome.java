package com.jayaprakash.linkedList;

public class LL234Palindrome {

    public static void main(String[] args) {

        ListNode node3= new ListNode(1);
        ListNode node2= new ListNode(2,node3);
        ListNode node1= new ListNode(1,node2);
        ListNode node7= new ListNode(1,node1);

        isPalindrome(node7);

    }

    public static boolean isPalindrome(ListNode head) {

        ListNode mid=middleNode(head);
        ListNode headSecond= reverseList(mid);
        ListNode rereverseHead= headSecond;

        //compare both halves
        while(head!=null && headSecond!=null) {
            if(head.val!=headSecond.val) {
                break;
            }
            head=head.next;
            headSecond=headSecond.next;
        }

        reverseList(rereverseHead);

        return head==null || headSecond==null;
    }


    public static ListNode middleNode(ListNode head) {

        ListNode fast=head;
        ListNode second=head;

        while(fast!=null && fast.next!=null) {
            fast=fast.next.next;
            second=second.next;

        }

        return second;


    }

    public static ListNode reverseList(ListNode head) {

        ListNode prev=null;
        ListNode current=head;
        ListNode next=current.next;

        while(current!=null) {

            current.next=prev;
            prev=current;
            current=next;
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
