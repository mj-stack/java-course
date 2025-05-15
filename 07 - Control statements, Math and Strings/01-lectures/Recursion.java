
import java.util.Scanner;

public class Recursion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to factorial generator \n");
    System.out.print("Please enter your number: ");
    int num = input.nextInt();
    // long fact = factorialIterator(num);
    long fact = factorialRecursion(num);
    System.out.println("Factorial of your number is " + fact);
  }

  public static long factorialRecursion(int num) {
    if (num == 1) {
      return 1;
    }
    return num * factorialRecursion(num - 1);
  }

  public static long factorialIterator(int num) {
    long result = 1;
    for (int i = num; i > 0; i--) {
      result *= i;
    }
    return result;
  }
}
