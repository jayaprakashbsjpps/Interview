package com.company.code;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EpamInterview2 {

    public static void main(String[] args) {

//        List<Integer> integers = List.of(1,2,3,4,5);
//
//       Stream<Integer> integerStream= integers.stream().map(i->i*2);
//       integerStream.forEach(System.out::println);
//       List<Integer> list= integerStream.collect(Collectors.toList());

        // Sample data
        List<Movie> movies = List.of(
                new Movie(1, "Jumanji", 1995, "tt0113497", List.of(new Director(1, "Joe Johnston", "nm0426671"))),
                new Movie(2, "Jurassic Park", 1993, "tt0107290", List.of(new Director(2, "Steven Spielberg", "nm0000229"))),
                new Movie(3, "King Kong", 2005, "tt0360717", List.of(new Director(3, "Peter Jackson", "nm0001392"))),
                new Movie(4, "Jack Reacher", 2012, "tt0790724", List.of(new Director(4, "Christopher McQuarrie", "nm0578853"))),
                new Movie(5, "Jumanji: Welcome to the Jungle", 2017, "tt2283362", List.of(new Director(5, "Jake Kasdan", "nm0442248")))
        );

      Map<String,Long> map = movies.stream().filter(m->m.getTitle().startsWith("J")).flatMap(m->m.getDirectors().stream())
                .collect(Collectors.groupingBy(m->m.getName(),Collectors.counting()));
        System.out.println(map);

//        Given an array of strings strs, group the
//                anagrams
//        together. You can return the answer in any order.
//
//
//
//        Example 1:
//
//        Input: strs = ["eat","tea","tan","ate","nat","bat"]
//
//        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    }


}
//Is this correct
//class Parent {
//    void methodA() throws IOException {
//        System.out.println("Parent:Method A");
//    }
//}
//
//class Child extends Parent {
//
//    void methodA() throws Exception {
//        System.out.println("Parent:Method A");
//    }
//}

class Director {
    private int id;
    private String name;
    private String imdb;

    public Director(int id, String name, String imdb) {
        this.id = id;
        this.name = name;
        this.imdb = imdb;
    }

    public String getName() {
        return name;
    }
}

 class Movie {
    private int id;
    private String title;
    private int year;
    private String imdb;
    private List<Director> directors;

     public Movie(int id, String title, int year, String imdb, List<Director> directors) {
         this.id = id;
         this.title = title;
         this.year = year;
         this.imdb = imdb;
         this.directors = directors;
     }

     public String getTitle() {
         return title;
     }

     public List<Director> getDirectors() {
         return directors;
     }

}


