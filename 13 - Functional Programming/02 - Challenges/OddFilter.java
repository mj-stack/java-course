import java.util.List;

public class OddFilter {
    public static void main(String[] args) {
        List<Integer> intArray = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> newArray = intArray.stream().filter(a -> a % 2 != 0).toList();
        System.out.println(newArray);
    }
}
