package in.kgcoding.equals;

public class EqualAndHashcodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Mukul Joshi", 21, "001");
        Person person2 = new Person("Mukul Joshi", 20, "001");

        if (person1.equals(person2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
