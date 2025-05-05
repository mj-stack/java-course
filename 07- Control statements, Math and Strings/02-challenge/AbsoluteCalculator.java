
import java.util.Scanner;

public class AbsoluteCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcomt to absolute calculator \n");
    System.out.print("Enter the number to check the absolute: ");
    int num = input.nextInt();
    absChecker(num);
  }

  public static void absChecker(int num) {
    int absolute;
    if (num == 0) {
      absolute = 0;
    } else if (num > 0) {
      absolute = num;
    } else {
      absolute = -num;
    }

    System.out.println("Absolute of " + num + " is " + absolute);
  }
}
