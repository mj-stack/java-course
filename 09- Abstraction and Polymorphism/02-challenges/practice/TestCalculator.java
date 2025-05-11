package practice;

public class TestCalculator extends Calculator {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(6, 7));
        System.out.println(c.add(9, 8, 6));
        System.out.println(c.add(8.6, 6.5));
    }
}
