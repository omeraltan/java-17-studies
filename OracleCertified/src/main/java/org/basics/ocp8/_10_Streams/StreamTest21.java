package org.basics.ocp8._10_Streams;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.IntStream;

public class StreamTest21 {

    public static void main(String[] args) {

        Random rand = new Random();
        IntStream is = IntStream.generate(rand::nextInt).limit(10);
        IntSummaryStatistics stat = is.summaryStatistics();
        System.out.println("-----");
        System.out.println(stat.getSum());
        System.out.println(stat.getMax());
        System.out.println(stat.getMin());
        System.out.println(stat.getAverage());
        System.out.println(stat.getCount());

    }

}
