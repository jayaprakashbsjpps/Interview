//package com.jayaprakash.generics;
//
//import java.util.Arrays;
//
//public class WildCardExample<T extends Number> {
//
//    private Object[] data;
//    private static int DEFAULT_SIZE = 10;
//    private  int size = 0;
//
//    public WildCardExample() {
//
//        this.data = new Object[DEFAULT_SIZE];
//    }
//
//    public void add(T num) {
//        if(isFull()) {
//            resize();
//        }
//        data[size++] = num;
//    }
//
//    private void resize() {
//        Object[] temp = new Object[data.length * 2];
//        for (int i = 0; i < data.length; i++) {
//
//            temp[i]= data[i];
//        }
//        data = temp;
//    }
//
//    public T remove() {
//        T removed = (T) data[--size];
//        return removed;
//    }
//
//    public T get(int index) {
//
//        return (T)data[index];
//    }
//
//    public void  set(int index, T value) {
//        data[index] = value;
//    }
//
//    private boolean isFull() {
//        return size == data.length;
//    }
//
//    @Override
//    public String toString() {
//        return "CustomArrayList{" +
//                "data=" + Arrays.toString(data) +
//                ", size=" + size +
//                '}';
//    }
//
//    public static void main(String[] args) {
//
//       // ArrayList list = new ArrayList();
//
//        WildCardExample<String> list = new WildCardExample<Integer>();
////        list.add(3);
////        list.add(5);
////        list.add(9);
//        list.add("Jp");
//        for (int i = 0; i < 14; i++) {
//
//            list.add(i * 4);
//        }
//        System.out.println(list);
//
//       // ArrayList<Integer> list2 = new ArrayList<Integer>();
//
//        //list2.add("Jp1");
//
//
//    }
//}
