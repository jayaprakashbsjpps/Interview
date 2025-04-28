package com.jayaprakash.string;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class AppearTwice2351 {

    public static void main(String[] args) {

        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));

    }

    public static char repeatedCharacter(String s) {

        Set<Character> seen = new HashSet<>();
        return s.chars().mapToObj(c->(char) c).filter(c->!seen.add(c))
                .findFirst().orElse('1');

    }
}
