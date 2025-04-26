
import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    System.out.print("Enter the number you want multiplication table of: ");
    int num = input.nextInt();
    table(num);
  }

  public static void table(int num) {
    int multiplier = 1;
    while (multiplier <= 10) {
      System.out.println(num + " * " + multiplier + " = " + (num*multiplier));
      multiplier++;
    }
  }
}
