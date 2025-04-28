package com.jayaprakash.compare;

public class Student {

    int rollNo;
    float marks;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
//        System.out.println("Running in compare method");
//        int diff = (int) (this.marks - o.marks);
//
//        return diff;
//    }
}
