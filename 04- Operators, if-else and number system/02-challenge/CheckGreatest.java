
import java.util.Scanner;

public class CheckGreatest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your first num: ");
    int num1 = input.nextInt();
    System.out.print("Enter your second num: ");
    int num2 = input.nextInt();
    System.out.print("Enter your third num: ");
    int num3 = input.nextInt();

    if (num1 > num2 && num1 > num3) {
      System.out.println(num1 + " is the greatest");
    } else if (num2 > num3 && num2 > num1) {
      System.out.println(num2 + " is the greatest");
    } else {
      System.out.println(num3 + " is the greatest");
    }
  }
}
