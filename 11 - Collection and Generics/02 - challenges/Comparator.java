import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        /*
         List<String> myList = new ArrayList<>();
         myList.add("Bear");
         myList.add("Lion");
         myList.add("Ant");
        */
        List<String> myList = Arrays.asList("Bear", "Zebra", "Lion", "Ant");
        System.out.println(myList);
        sortInDescending(myList);
        System.out.println(myList);
    }

    public static void sortInDescending(List<String> myList) {
        Collections.sort(myList, new java.util.Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)) {
                    return 0;
                } else if (o1.charAt(0) < o2.charAt(0)) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }
}
