package in.kgcoding.filterandreduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        int sum = 0;
//        for (Integer number : numbers) {
//            sum += number;
//        }
//        System.out.println(sum);
        sum = numbers.stream()
                .reduce(0, (a, b) -> a+b);
        System.out.printf("Sum with reduce method: %d", sum);

        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.printf("Max with reduce method: %d", max);
    }
}
