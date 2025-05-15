import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        List<String> favMovies = new ArrayList<>();
        favMovies.add("The Avengers");
        favMovies.add("Avengers: Age of ultron");
        favMovies.add("Avengers: Infinity War");
        favMovies.add("Avengers: Endgame");
        List<Integer> myNums = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Before reversing: ");
        System.out.println(favMovies);
        System.out.println(myNums);

        System.out.println();

        System.out.println("After reversing: ");
        Collections.reverse(favMovies);
        Collections.reverse(myNums);
        System.out.println(favMovies);
        System.out.println(myNums);
    }
}
