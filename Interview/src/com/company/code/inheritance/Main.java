package com.jayaprakash.inheritance;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        Box box1 = new Box(4.0,5.0,9.0);
//        Box box2 = new Box(box1);
//        System.out.println("Length= "+box2.length+ " Breadth= "+ box2.breadth+" Height "+ box2.height);

//        BoxWeight box3 = new BoxWeight();
//        System.out.println("Box 3 weight="+box3.weight+ " Box3.height="+box3.height+" Box3.length="+box3.length+" Box3.breadth="+box3.breadth);

        ArrayList<String> list = new ArrayList<String>();

        Box box5 =new BoxWeight(2,3,4,8);

        Box box = new BoxWeight();
        box.greeting();

        BoxWeight box6 = new BoxWeight(4.0,5.0,6.0,8.0);

        BoxWeight.greeting();

     System.out.println("Box 6 weight="+box6.weight+ " Box3.height="+box6.height+" Box3.length="+box6.length+" Box3.breadth="+box6.breadth);

        //System.out.println("Box 3 weight="+box5.weight+ " Box3.height="+box5.height+" Box3.length="+box5.length+" Box3.breadth="+box5.breadth);

    }
}
