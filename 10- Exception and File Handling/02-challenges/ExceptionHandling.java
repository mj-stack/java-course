import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to division calculator \n");
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();
        division(first, second);
    }

    public static void division(int first, int second) {
        try {
            int result = (first / second);
            System.out.printf("The result for the division is: %d \n", result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + " Cannot divide by zero");
        } finally {
            System.out.println("Your problem got solved");
        }
    }
}
