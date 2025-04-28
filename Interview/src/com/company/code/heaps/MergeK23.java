package com.jayaprakash.heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeK23 {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);

        node4.next = node5;
        node5.next = node6;

        ListNode node7 = new ListNode(2);
        ListNode node8 = new ListNode(6);

        node7.next = node8;

        ListNode[] lists = new ListNode[3];
        lists[0] = node1;
        lists[1] = node4;
        lists[2] = node7;

        mergeKLists(lists);
    }

    public static ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(Comparator.comparingInt((ListNode o)->o.val));
        ArrayList<ListNode> result = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {

            ListNode cursor = lists[i];
            while (cursor != null) {
                minHeap.offer(cursor);
                cursor = cursor.next;
            }

        }

        ListNode node=null;
        while(!minHeap.isEmpty()) {
            node = minHeap.poll();
            node.next=minHeap.peek();
        }
        node.next=null;
        ListNode node8 = new ListNode(20);
        return node8;

    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
