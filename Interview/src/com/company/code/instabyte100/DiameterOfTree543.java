package com.jayaprakash.instabyte100;

import java.util.stream.Collectors.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;

public class DiameterOfTree543 {

    public static void main(String[] args) {

        System.out.println(IntStream.rangeClosed(1,10).boxed().collect(groupingBy(s->{
            if(s%2==0) return "even";
            else return "odd";
        })));

        System.out.println(IntStream.rangeClosed(1,10).boxed().collect(partitioningBy(s->s%2==0)));
    }
}
