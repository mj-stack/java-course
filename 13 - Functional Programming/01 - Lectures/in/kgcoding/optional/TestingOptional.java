package in.kgcoding.optional;

import java.util.List;
import java.util.Optional;

public class TestingOptional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(/* 1, 2, 3, 4, 5, 6*/);

        Optional<Integer> sum2 = numbers.stream()
                .reduce(Integer::sum);
        if (sum2.isPresent()) {
            System.out.println(sum2.get());
        } else {
            System.out.println("List is empty");
        }
    }
}
