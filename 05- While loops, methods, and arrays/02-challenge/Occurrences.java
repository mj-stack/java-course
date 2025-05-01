
import java.util.Scanner;

public class Occurrences {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] myArray = {1, 2, 2, 2, 3, 4, 4, 5, 5, 6};
    System.out.print("Enter the number to check: ");
    int num = input.nextInt();
    checkOccurrences(myArray, num);
  }

  public static void checkOccurrences(int[] myArray, int num) {
    int i = 0;
    int count = 0;
    while (i < myArray.length) {
      if (num == myArray[i]) {
        count++;
      }
      i++;
    }
    if (count > 0) {
      System.out.println("Your number occurred " + count + " times.");
    } else {
      System.out.println("Your number was not in the array!");
    }
  }
}
