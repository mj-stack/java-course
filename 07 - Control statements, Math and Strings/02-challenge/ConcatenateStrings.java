
import java.util.Scanner;

public class ConcatenateStrings {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first string: ");
    String str1 = input.next();
    System.out.print("Enter Second string: ");
    String str2 = input.next();

    System.out.println("Here is the concatenated string with capital letters: ");
    System.out.printf("%S %S!", str1, str2);
    System.out.println();
  }
}
