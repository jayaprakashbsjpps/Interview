package com.jayaprakash.threads;

import java.util.concurrent.CompletableFuture;

public class CompleteFuture1 {
    public static void main(String[] args) {

        CompletableFuture<String> future = CompletableFuture.supplyAsync(()->{
            return "Hello";
        });

        future.thenApply(result->result+"World")
                .thenAccept(System.out::println);
    }
}
