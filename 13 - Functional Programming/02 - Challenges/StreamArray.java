import java.util.List;

public class StreamArray {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Mango", "Papaya", "Guava", "Grapes");

        fruits.stream().forEach(fruit -> System.out.println(fruit));
    }
}
