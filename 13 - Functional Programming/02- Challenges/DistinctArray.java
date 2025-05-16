import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctArray {
    public static void main(String[] args) {
        List<Integer> myArray = List.of(8, 2, 8, 8, 4, 1, 5, 9, 0, 0);
        List<Integer> newArray = myArray.stream().distinct().toList();
        System.out.println(newArray);
    }
}
