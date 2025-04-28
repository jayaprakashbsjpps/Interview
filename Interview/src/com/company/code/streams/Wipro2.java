package com.jayaprakash.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Wipro2 {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>(Arrays.asList(
                new User("Raj", 30),
                new User("Karan", 26),
                new User("Ram", 26),
                new User("Ben", 42)));


        System.out.println(userList.stream().sorted(Comparator.comparing(User::getName)).collect(Collectors.toList()));

        System.out.println(userList.stream().sorted(Comparator.comparingInt(User::getAge)).collect(Collectors.toList()));
    }


}

class User {


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
