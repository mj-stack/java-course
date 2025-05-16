
import java.util.Scanner;

public class CheckOddEven {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number to check odd or even: ");
    int num = input.nextInt();

    if(num%2 == 0) {
      System.out.println("Your number is an even number");
    } else {
      System.out.println("Your number is an odd number");
    }
  }
}