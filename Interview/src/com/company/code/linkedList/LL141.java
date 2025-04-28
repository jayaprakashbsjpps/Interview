package com.jayaprakash.linkedList;

public class LL141 {


    public static void main(String[] args) {

        ListNode node3= new ListNode(4);
        ListNode node2= new ListNode(0,node3);
        ListNode node1= new ListNode(5,node2);
        node3.next=node2;
        ListNode node7= new ListNode(2,node1);
        ListNode node8= new ListNode(3,node7);

        //display(node7);

        System.out.println(lengthOfCycle(node8));
    }


    public static int lengthOfCycle(ListNode head) {

        ListNode fast=head;
        ListNode slow=head;

        int count=0;

        while(fast!=null && fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow) {

                while(slow.next!=fast) {
                    count++;
                    slow=slow.next;
                }

                return count;
            }
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

    public boolean hasCycle(ListNode head) {

        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow) {
                return true;
            }
        }

        return false;

    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
