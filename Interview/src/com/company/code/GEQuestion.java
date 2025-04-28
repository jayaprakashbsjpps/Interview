package com.jayaprakash;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Suppose we have a list of students, and we want to convert the list into a map where the student ID is the key and the student name is the value, but only for students whose names start with the letter "A"
public class GEQuestion {

    public static void main(String[] args) {

//        List<Student> students = Arrays.asList(new Student(1,"Alice"),
//                                                   new Student(2,"Bob"),
//                                                    new Student(3, "Anna"),
//                                                    new Student(4, "Charlie"),
//                                                    new Student(5, "Aaron")
//                                                    );
//
//        Map<Integer,String> map=   students.stream().filter(student -> student.getName().startsWith("A"))
//                         .collect(Collectors.toMap(Student::getId,Student::getName));

//        List<Integer> list1= Arrays.asList(1,2,3,4,5);
//        List<Integer> list2= Arrays.asList(4,5,6,7,8);
//
//        System.out.println(list1.stream().filter(list2::contains).collect(Collectors.toList()));

        System.out.println();

    }

    static class Student {

        private int id;
        private String name;

        public Student(int id,String name) {
            this.id=id;
            this.name=name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

}
