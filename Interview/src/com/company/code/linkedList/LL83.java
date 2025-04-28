package com.jayaprakash.linkedList;

public class LL83 {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2,node1);
        ListNode node3 = new ListNode(2,node2);
        ListNode node4 = new ListNode(2,node3);

        ListNode node5= deleteDuplicates(node4);
        while(node5!=null) {

            System.out.print(node5.val+"->");
            node5=node5.next;
        }

    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode node = head;

        while(node!=null && node.next!=null && node.val==node.next.val) {

            node=node.next;
        }
        head = node;

        while(node!=null) {

            if(node.next!=null && node.val==node.next.val) {

                node.next=node.next.next;
            }

            node=node.next;
        }

        return head;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}


