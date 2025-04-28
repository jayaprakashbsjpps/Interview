package com.jayaprakash.access;

public class ObjectDemo {
    int num;
    float gpa;


    public ObjectDemo(int num,float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
        //return num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num==((ObjectDemo )obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo objectDemo = new ObjectDemo(12,56.8f);
        ObjectDemo objectDemo1 = new ObjectDemo(12,79.9f);
        System.out.println(objectDemo.hashCode());
        System.out.println(objectDemo1.hashCode());

        if(objectDemo == objectDemo1) {
            System.out.println("Object 1 is less than Object 2");
        }

        if (objectDemo.equals(objectDemo1)) {
            System.out.println("Object 1 is less than Object 2");
        }

    }
}
