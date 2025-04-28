package com.jayaprakash.instabyte100_2;

public class MergeList_21 {

    public static void main(String[] args) {

        ListNode list1node1 = new ListNode(1);
        ListNode list1node2 = new ListNode(2);
        ListNode list1node3 = new ListNode(4);

        list1node1.next=list1node2;
        list1node2.next=list1node3;

        ListNode list2node1 = new ListNode(1);
        ListNode list2node2 = new ListNode(3);
        ListNode list2node3 = new ListNode(4);

        list2node1.next=list2node2;
        list2node2.next=list2node3;

        mergeTwoLists(list1node1,list2node1);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while(list1!=null && list2!=null) {
            if(list1.val <list2.val) {
               current.next=list1;
               list1=list1.next;
            }else {
                current.next=list2;
                list2=list2.next;
            }

            current=current.next;
        }
        current.next=(list1!=null) ?list1:list2;
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
