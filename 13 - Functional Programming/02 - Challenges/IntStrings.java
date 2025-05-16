import java.util.List;
import java.util.Optional;

public class IntStrings {
    public static void main(String[] args) {
        List<String> intStr = List.of("1", "2", "3", "4", "5");
        intStr.stream()
                .map(Integer::parseInt)
                .map(num -> Math.pow(num, 2))
                .reduce(Double::sum)
                .ifPresent(System.out::println);
    }
}
