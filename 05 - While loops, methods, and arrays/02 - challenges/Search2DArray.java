
import java.util.Scanner;

public class Search2DArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to 2D search: ");
    int[][] numsArr = ArrayUtility.input2DArray();
    System.out.print("Now enter the number you want to search: ");
    int num = input.nextInt();
    boolean isFound = search(numsArr, num);
    if (isFound) {
      System.out.println("Number found");
    } else {
      System.out.println("Number not found");
    }
  }

  public static boolean search(int[][] numsArr, int num) {
    int i = 0;
    while (i < numsArr.length) {
      int j = 0;
      while (j < numsArr[i].length) {
        if (numsArr[i][j] == num) {
          return true;
        }
        j++;
      }
      i++;
    }
    return false;
  }
}
