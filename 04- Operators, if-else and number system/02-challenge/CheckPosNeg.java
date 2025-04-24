
import java.util.Scanner;

public class CheckPosNeg {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int num = input.nextInt();

    if (num == 0) {
      System.out.println("Your number is 0");
    } else if (num < 0) {
      System.out.println("Your number is -ve");
    } else {
      System.out.println("Your number is +ve");
    }
  }
}
