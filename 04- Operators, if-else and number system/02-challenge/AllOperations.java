import java.util.Scanner;

public class AllOperations {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number 1: ");
    int x = input.nextInt();
    System.out.print("Enter number 2: ");
    int y = input.nextInt();

    System.out.println("All operations");
    System.out.println("x+y " + (x+y));
    System.out.println("x-y " + (x-y));
    System.out.println("x*y " + (x*y));
    System.out.println("x/y " + (x/y));
    System.out.println("x%y " + (x%y));
  }
}
