
import java.util.Scanner;

public class OddEvenBitwise {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = input.nextInt();

    if ((num & 1) == 0) {
      System.out.println("Number is even");
    } else {
      System.out.println("Number is odd");
    }
  }
}
