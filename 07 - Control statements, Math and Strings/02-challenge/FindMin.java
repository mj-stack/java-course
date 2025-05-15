
import java.util.Scanner;

public class FindMin {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to minimum number checker \n");
    System.out.print("Enter number 1: ");
    int num1 = input.nextInt();
    System.out.print("Enter number 2: ");
    int num2 = input.nextInt();
    minChecker(num1, num2);
  }

  public static void minChecker(int num1, int num2) {
    int smallestNum = num1 < num2 ? num1 : num2;
    System.out.println(smallestNum + " is minimum among two");
  }
}