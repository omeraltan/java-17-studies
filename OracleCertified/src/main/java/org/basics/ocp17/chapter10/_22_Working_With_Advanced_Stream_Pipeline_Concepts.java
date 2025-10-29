package org.basics.ocp17.chapter10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _22_Working_With_Advanced_Stream_Pipeline_Concepts {

    public static void main(String[] args) {

        long count = Stream.empty().collect(Collectors.counting());
        System.out.println("count : " + count);

        System.out.println("-------------------------");

        long count2 = Stream.of("laptop","monitor","keyboard","mouse").collect(Collectors.counting());
        System.out.println("count : " + count2);

        System.out.println("-------------------------");

        List<Integer> list = Stream.of(2,4,6,8,10,12)
            .collect(Collectors.filtering(n -> n % 4 == 0, Collectors.toList()));
        System.out.println(list);

        System.out.println("-------------------------");

        IntStream intStream = IntStream.of(60,5,3,10,1,2,40);
        Optional<Integer> optionalMax = intStream.boxed()
            .collect(Collectors.maxBy(Comparator.naturalOrder()));

        optionalMax.ifPresent(System.out::println);

        System.out.println("-------------------------");

        IntStream intStream2 = IntStream.of(60,5,3,10,1,2,40);
        Optional<Integer> optionalMax2 = intStream2.boxed()
            .collect(Collectors.minBy(Comparator.naturalOrder()));

        optionalMax2.ifPresent(System.out::println);

        System.out.println("-------------------------");

        List<Integer> integerList = Arrays.asList(10,20,30,40);
        Stream<Integer> integerStream = integerList.stream();
        IntSummaryStatistics intSummaryStatistics = integerStream
            .collect(Collectors.summarizingInt(e -> e));

        System.out.println("max : " + intSummaryStatistics.getMax());
        System.out.println("min : " + intSummaryStatistics.getMin());
        System.out.println("count : " + intSummaryStatistics.getCount());
        System.out.println("average : " + intSummaryStatistics.getAverage());
        System.out.println("sum : " + intSummaryStatistics.getSum());

        System.out.println("-------------------------");

        List<Employee> employeeList = Arrays.asList(
            new Employee("Tom Jpnes", 45, 15000.00, 190),
            new Employee("Tom Jpnes", 45, 7000.00, 220),
            new Employee("Ethan Hardy", 65, 8000.00, 1000),
            new Employee("Nancy Smith", 22, 1000.00, 5),
            new Employee("Deborah Sprightly", 29, 9000.00, 45)
        );

        IntSummaryStatistics intSummaryStatistics1 = employeeList
            .stream()
            .collect(Collectors.summarizingInt(Employee::getAge));
        System.out.println("IntSummaryStatistics for age : " + intSummaryStatistics1);

        LongSummaryStatistics longSummaryStatistics1 = employeeList
            .stream()
            .collect(Collectors.summarizingLong(Employee::getLeaves));
        System.out.println("LongSummaryStatistics for leaves : " + longSummaryStatistics1);

        DoubleSummaryStatistics doubleSummaryStatistics1 = employeeList
            .stream()
            .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("DoubleSummaryStatistics for leaves : " + doubleSummaryStatistics1);

        System.out.println("-------------------------");




    }

}

class Employee{
    private String name;
    private Integer age;
    private Double salary;
    private Integer leaves;

    public Employee(String name, Integer age, Double salary, Integer leaves) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.leaves = leaves;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getLeaves() {
        return leaves;
    }

    public void setLeaves(Integer leaves) {
        this.leaves = leaves;
    }

}

/**
 *
 * -------------------- counting(), filtering(), maxBy(), minBy(), summarizingInt(), summarizingLong(), summarizingDouble()
 *
 */
