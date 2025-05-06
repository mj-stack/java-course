
import java.util.Scanner;

public class FibonacciRecursion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Fibonacci Sequence \n");
    System.out.print("Enter the number to see the magic: ");
    int count = input.nextInt();
    for (int i = 1; i <= count; i++) {
      System.out.print(fibonacciPrinter(i) + " ");
    }
    System.out.println();
  }

  public static int fibonacciPrinter(int position) {
    if (position == 1) {
      return 0;
    }

    if (position == 2) {
      return 1;
    }
    return fibonacciPrinter(position - 1) + fibonacciPrinter(position - 2);
  }
}
