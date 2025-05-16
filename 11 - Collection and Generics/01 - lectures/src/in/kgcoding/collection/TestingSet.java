package in.kgcoding.collection;
import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Mukul"));
        System.out.println(names.add("Anmol"));
        System.out.println(names.add("MJ"));
        Utility.print(names);

        System.out.println(names.add("Mukul"));
        System.out.println(names.size());
        Utility.print(names);

        System.out.println(names.contains("Mukul"));
        System.out.println(names.remove("Mukul"));
        Utility.print(names);
        System.out.println(names.remove("Mukul"));
    }
}
