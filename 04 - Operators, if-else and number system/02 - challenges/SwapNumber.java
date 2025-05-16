
import java.util.Scanner;

public class SwapNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Welcome to the swaping station \n\n");
    System.out.print("Enter the value of a: ");
    int a = input.nextInt();
    System.out.print("Enter the value of b: ");
    int b = input.nextInt();
    System.out.println("\n");
    System.out.println("Values of a and b in the starting a=" + a + " and b=" + b);
    int c = a;
    a = b;
    b = c;
    System.out.println("Values of a and b in the end a=" + a + " and b=" + b);
  }
}
