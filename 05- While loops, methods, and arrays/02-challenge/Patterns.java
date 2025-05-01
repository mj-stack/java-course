
import java.util.Scanner;

public class Patterns {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number to print the pattern: ");
    int rows = input.nextInt();
    printRightHalfPyramid(rows);
    System.out.println();
    printReverseRHP(rows);
    System.out.println();
    printLeftHalfPyramid(rows);
  }  

  public static void printRightHalfPyramid(int maxRows) {
    int rows = 0;
    while (rows < maxRows) {
      System.out.print("*");
      int i = 0;
      while (i < rows) {
        System.out.print(" *");
        i++;
      }
      System.out.println();
      rows++;
    }
  }

  public static void printReverseRHP(int maxRows) {
    int rows = maxRows;
    while (rows > 0) {
      int i = rows;
      while (i > 0) {
        System.out.print("* ");
        i--;
      }
      System.out.println();
      rows--;
    }
  }

  public static void printLeftHalfPyramid(int maxRows) {
    int rows = maxRows;
    while (rows > 0) {
      int j = 0;
      while (j < rows - 1) {
        System.out.print("  ");
        j++;
      }


      int i = 0;
      while (i <= maxRows-rows) {
        System.out.print("* ");
        i++;
      }
      System.out.println();
      rows--;
    }
  } 
}






