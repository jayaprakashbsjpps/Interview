package com.jayaprakash.linkedList;

public class LL142 {

    public static void main(String[] args) {

    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode detectCycle(ListNode head) {

        ListNode first=head;
        ListNode fast=head;
        ListNode slow=head;

        if(head==null) {
            return head;
        }

        while(fast.next!=null && fast.next.next!=null && fast!=null && slow!=null) {

            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow) {

                while(slow!=first) {

                    slow=slow.next;
                    first=first.next;
                }
                return first;

            }


        }

        return null;
    }
}
