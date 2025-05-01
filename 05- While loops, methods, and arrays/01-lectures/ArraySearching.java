
import java.util.Scanner;

public class ArraySearching {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] arr = {3, 6, 8, 87, 65, 4, 68, 23, 9, 89, 34};
    System.out.println("Welcome to Array searching");
    System.out.print("Enter your number to check the availability: ");
    int num = input.nextInt();

    int i = 0;
    while (i < arr.length) {
      int arrayElement = arr[i];
      if (arrayElement == num) {
        System.out.println("Your number found at " + i + " index");
        return;
      }
      i++; 
    }
    System.out.println("Your number not found");
  }
}
