package com.jayaprakash.instabyte100;

public class Jaya2 {

    public static void main(String[] args) {

        //Write a java program to find the index positions of a string
       // For example, Given String "aaabcddccdcbabcddadbaabcda" and input String "bcd" and output is 3,13,22

//        List<String> list = Arrays.asList("Jaya","Jaya","Suresh","Ramesh");
//        System.out.println(list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));

        String s="aaabcddccdcbabcddadbaabcda";

        String t="bcd";

        findSubStringIndexes(s,t);
    }

    public static void findSubStringIndexes(String s,String t) {

         int index = s.indexOf(t);
         boolean found = false;

         while (index!=-1) {
             System.out.println(index+" ");
             found=true;

             index=s.indexOf(t,index+1);
         }

         if (!found) {
             System.out.println("Substrig not found");
         }

    }
}
