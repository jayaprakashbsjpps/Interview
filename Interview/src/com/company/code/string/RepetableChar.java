package com.jayaprakash.string;

public class RepetableChar {

    public static void main(String[] args) {

        String name = "jmyj";

        System.out.println(repetableChar(name));

    }

    public static char repetableChar(String name) {

        for (int i = 0; i <= name.length() - 1; i++) {

            for (int j = i+1; j <= name.length() - 1; j++) {

                if (name.charAt(j) == name.charAt(i)) {

                    return name.charAt(j);
                }
            }


        }

        return 0;

    }
}
