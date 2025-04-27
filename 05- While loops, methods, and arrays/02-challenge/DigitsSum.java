import java.util.Scanner;

public class DigitsSum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number to check the sum of its digit: ");
    int num = input.nextInt();

    int sum = 0;
    while (num > 0) {
      int lastDigit = num%10;
      sum+=lastDigit;
      num /= 10;
    }

    System.out.println("Sum is: " + (sum));
  }
}
