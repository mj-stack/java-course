import java.util.List;

public class ArrayFilter {
    public static void main(String[] args) {
        List<String> myArray = List.of("Computer Science", "Software Engineering", "Mathematics", "English", "Hindi");
        String result = myArray.stream()
                .filter(str -> str.length() >= 10)
                .reduce("", (a, b) -> a + " " + b);


        System.out.println(result);
    }
}
