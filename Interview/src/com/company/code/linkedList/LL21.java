package com.jayaprakash.linkedList;

public class LL21 {

    public static void main(String[] args) {

        ListNode node3= new ListNode(4);
        ListNode node2= new ListNode(2,node3);
        ListNode node1= new ListNode(1,node2);


        ListNode node6= new ListNode(4);
        ListNode node5= new ListNode(3,node6);
        ListNode node4= new ListNode(1,node5);

        ListNode node7= mergeTwoLists(node1,node4);

        display(node7);
    }

    public static void display(ListNode node) {

        ListNode temp = node;

        while(temp!=null) {
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }

        System.out.println("END");
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while(list1!=null && list2!=null) {

            if(list1.val<list2.val) {

                tail.next=list1;
                list1=list1.next;
                tail=tail.next;

            } else  {

                tail.next=list2;
                list2=list2.next;
                tail=tail.next;

            }
        }

        tail.next= (list1!=null) ? list1:list2;
        return dummyHead.next;


    }


    static void swap(ListNode list1,ListNode list2) {

        int temp = list1.val;
        list1.val=list2.val;
        list2.val=temp;
    }


    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
