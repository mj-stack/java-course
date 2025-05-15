package in.kgcoding.collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Mukul");
        strList.add("Joshi");
        strList.add(1, "Chandra");
        strList.removeFirst();

        if (strList.contains("Joshi")) {
            System.out.println("Joshi exists at " + strList.indexOf("Joshi"));
        }

        for (String s : strList) {
            System.out.print(s + " ");
        }
    }
}
