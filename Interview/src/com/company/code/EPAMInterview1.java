package com.jayaprakash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class EPAMInterview1 {

    public static List<String> processEmployees(List<Employee> employees) {
        // Implement your solution here

         return employees.stream().filter(emp->emp.getAge()>=30)
                                  .sorted(Comparator.comparing(Employee::getName))
                 .map(e->e.getName()).distinct().collect(Collectors.toList());
    }

    public static List<String> filterAndSortEmployeesByDepartmentAndAge(List<Employee> employees) {
//        return List.of();
        return employees.stream().filter(e->e.getDepartment().equalsIgnoreCase("HR"))
                .sorted(Comparator.comparingInt(Employee::getAge)).map(e->e.getName()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 28, "HR"),
                new Employee("Bob", 32, "Engineering"),
                new Employee("Charlie", 30, "Marketing"),
                new Employee("David", 25, "Engineering"),
                new Employee("Eve", 35, "HR")
        );

        List<String> result = processEmployees(employees);
        result.forEach(System.out::println);

        List<String> concurrentResult = processEmployeesConcurrently(employees);
        concurrentResult.forEach(System.out::println);

        List<String> filterResult = filterAndSortEmployeesByDepartmentAndAge(employees);
        filterResult.forEach(System.out::println);
    }

    static class Employee {
        private String name;
        private int age;
        private String department;

        public Employee(String name, int age, String department) {
            this.name = name;
            this.age = age;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getDepartment() {
            return department;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", department='" + department + '\'' +
                    '}';
        }
    }

    public static List<String> processEmployeesConcurrently(List<Employee> employees) {
        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        List<Callable<List<Employee>>> tasks = employees.stream()
                .filter(e -> e != null && e.getAge() >= 30)
                .map(e -> (Callable<List<Employee>>) () -> Collections.singletonList(e))
                .collect(Collectors.toList());

        try {
            List<Future<List<Employee>>> results = executor.invokeAll(tasks);

            List<Employee> filteredEmployees = new ArrayList<>();
            for (Future<List<Employee>> result : results) {
                filteredEmployees.addAll(result.get());
            }
            executor.shutdown();
            return filteredEmployees.stream()
                    .sorted(Comparator.comparing(Employee::getName))
                    .map(Employee::getName)
                    .collect(Collectors.toList());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            return Collections.emptyList();
        } finally {
            if (!executor.isShutdown()) {
                executor.shutdownNow();
            }
        }
    }

}

