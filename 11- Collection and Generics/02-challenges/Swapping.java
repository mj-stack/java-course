import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Swapping {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numList);
        Collections.swap(numList, 0, 4);
        System.out.println(numList);
    }
}
