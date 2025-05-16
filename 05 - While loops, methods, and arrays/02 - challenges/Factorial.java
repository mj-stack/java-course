
import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the num you want factorial of: ");
    int num = input.nextInt();
    int factorial = 1;
    while (num > 0) {
      factorial *= num;
      num--;
    }
    System.out.println("The factorial is: " + factorial);
  }
}
