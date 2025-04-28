package com.jayaprakash.properties.polymorphism;

import com.jayaprakash.access.A;

public class Square extends Shapes{

    void area() {
        System.out.println("Area is square");

        A a = new A(5,"Square");
        //System.out.println(a.num);


    }
}
