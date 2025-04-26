import java.util.Scanner;
public class OddSum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the desired num to get the sum of all odd numbers till that number: ");
    int num = input.nextInt();
    int sNum = 1;
    int sum = 0;
    if (num == 0) {
      System.out.println("Your num is zero, hence can't be evaluated!");
      return;
    }
    while (sNum <= num) {
      sum +=sNum;
      sNum+=2;
    }
    System.out.println("The sum is " + sum);
  }
}
