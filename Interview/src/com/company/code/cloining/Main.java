package com.jayaprakash.cloining;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Human kunal = new Human(34,"Jp1");
        Human twin = (Human) kunal.clone();

        System.out.println("Twin age "+twin.age + " Name "+twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));

        System.out.println(Arrays.toString(kunal.arr));
    }
}
