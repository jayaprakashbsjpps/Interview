package com.jayaprakash.linkedList;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insert(int val, int index) {

        if(index==0) {
            insertFirst(val);
            return;
        }
        if(index==size) {
            insertLast(val);
        }

        Node temp= head;

        for (int i = 1; i < index ; i++) {

            temp=temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    public void insertFirst(int val) {
        Node node= new Node(val);
        node.next=head;
        head=node;

        if(tail==null) {
            tail=head;
        }

        size+=1;
    }

    public int deleteFirst() {

        int val = head.val;
        head = head.next;
        if(head==null) {
            tail=null;
        }
        size--;

        return val;
    }

    public int deleteLast() {

        if(size<=1) {
            return deleteFirst();
        }
        Node secondLast = get(size-2);

        int val=tail.val;
        tail=secondLast;
        tail.next=null;
        return val;
    }

    public int delete(int index) {
        if(index==0) {
            return  deleteFirst();
        }

        if(index==size-1){
            return deleteLast();
        }

        Node previous = get(index-1);
        int val= previous.next.val;
        previous.next= previous.next.next;
        return val;
    }
    public Node get(int index) {
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }

        return node;
    }

    public Node find(int value) {
        Node node=head;
        while (node!=null) {

            if(node.val==value) {
                return node;
            }
            node=node.next;
        }

        return node;
    }

    public void display() {

        Node temp = head;

        while(temp!=null) {
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }

        System.out.println("END");
    }

    public void insertLast(int val) {

        if(tail==null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insertRec(int val,int index) {

        head= insertRec(val,index,head);

    }

    public Node insertRec(int val,int index,Node node) {

        if(index==0) {
            Node temp= new Node(val,node);
            size++;
            return temp;
        }

        node.next= insertRec(val,index-1,node.next);
        return node;
    }
    private class Node {

        private Node next;
        private int val;

        public Node(){}

        public Node(int val) {
            this.val=val;
        }


        public Node(int val, Node next) {
            this.next = next;
            this.val = val;
        }


    }
}
