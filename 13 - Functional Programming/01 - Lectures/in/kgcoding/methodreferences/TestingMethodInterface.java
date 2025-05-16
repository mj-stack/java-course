package in.kgcoding.methodreferences;

import java.util.List;

public class TestingMethodInterface {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        numbers.stream()
                .filter(a -> a % 2 != 0)
                .forEach(number -> System.out.println(number));

        numbers.stream()
                .filter(a -> a % 2 != 0)
                .forEach(System.out::println);

        int sum = numbers.stream()
                .reduce(0, (a, b) -> a+b);
        System.out.printf("Sum with reduce method: %d", sum);

        int sum2 = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.printf("Sum with reduce method: %d", sum2);
    }
}
