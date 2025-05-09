import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person per)) return false;
        return per.name.equals(name) &&
                per.age == age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Mukul Joshi", 21);
        Person person2 = new Person("Mukul Joshi", 21);

        if (person1.equals(person2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
