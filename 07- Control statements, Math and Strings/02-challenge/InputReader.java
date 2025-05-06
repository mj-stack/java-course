
import java.util.Scanner;

public class InputReader {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to input reade \n");
    do {
      System.out.print("Enter the keyword: ");
      String inputStr = input.next();
      if (inputStr.equals("exit")) {
        System.out.println("Exiting...");
        break;
      }
    } while (true);
  }
}
