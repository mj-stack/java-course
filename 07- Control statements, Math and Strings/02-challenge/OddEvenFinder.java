
import java.util.Scanner;

public class OddEvenFinder {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Odd/Even checker \n");
    System.out.print("Enter you number: ");
    int num = input.nextInt();
    CheckOddEven(num);
  }

  public static void CheckOddEven(int num) {
    String numberType = (num % 2 == 0) ? "Even" : "Odd";
    System.out.println(num + " is " + numberType);
  }
}
