import java.util.Scanner;

public class MaxFinder {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to max finder \n");
    System.out.print("Enter the array size: ");
    int arraySize = input.nextInt();
    int[] numsArray = arrayCreator(arraySize);
    int[] filledArray = arrayFiller(numsArray);
    findMax(filledArray);
  }

  public static int[] arrayCreator(int arraySize) {
    int[] numsArray = new int[arraySize];
    return numsArray;
  }

  public static int[] arrayFiller(int[] numsArray) {
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < numsArray.length; i++) {
      System.out.print("Enter the number at " + (i + 1) + " place: ");
      numsArray[i] = input.nextInt();
    }
    System.out.print(java.util.Arrays.toString(numsArray));
    return numsArray;
  }

  public static void findMax(int[] array) {
    int max = array[0];
    for (int i : array) {
      if (i > max) {
        max = i;
      }
    }
    System.out.println(" Max num among the arary is " + max);
  }
}
