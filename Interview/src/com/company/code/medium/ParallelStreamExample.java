package com.jayaprakash.medium;

import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static void main(String[] args) {

        IntStream.range(1,11).parallel()
                .forEach(i->{
                    System.out.println("Thread: "+Thread.currentThread().getName()+" value"+i);
                });
    }
}
