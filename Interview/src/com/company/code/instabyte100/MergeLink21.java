package com.jayaprakash.instabyte100;

public class MergeLink21 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

        ListNode node3= new ListNode(4);
        ListNode node2= new ListNode(2,node3);
        ListNode node1= new ListNode(1,node2);


        ListNode node6= new ListNode(4);
        ListNode node5= new ListNode(3,node6);
        ListNode node4= new ListNode(1,node5);

        mergeTwoLists1(node1,node4);

    }

    public static ListNode mergeTwoLists1(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoLists1(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists1(l1, l2.next);
            return l2;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummyHead = new ListNode(-1);
        ListNode current = dummyHead;

        while(list1!=null && list2!=null) {

            if(list1.val<=list2.val) {
                current.next=list1;
                list1=list1.next;
            }else {
                current.next=list2;
                list2=list2.next;
            }
            current=current.next;
        }

        if(list1==null) {
            current.next=list2;
        } else {
            current.next=list1;
        }

        return dummyHead.next;
    }
}
