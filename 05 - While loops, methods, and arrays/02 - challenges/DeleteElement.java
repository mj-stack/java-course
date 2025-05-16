import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to element deletion center: \n");
    int[] myArray = ArrayUtility.inputArray();
    System.out.print("Enter the number you wanted to delete: ");
    int num = input.nextInt();
    int[] newArray = deleteElem(myArray, num);
    System.out.println(Arrays.toString(newArray));
  }  

  public static int[] deleteElem(int[] myArray, int numToDelete) {
    boolean isNumAvailable = isNumAvailable(myArray, numToDelete);
    if (isNumAvailable) {
      int[] newArray = new int[myArray.length - 1];
      int i = 0;
      int j = 0;
      while (i < myArray.length) {
        if(myArray[i] != numToDelete) {
          newArray[j] = myArray[i];
          j++;
        }
        i++;
      }
      return newArray;
    }
    return myArray;
  }

  public static boolean isNumAvailable(int[] myArray, int numToCheck) {
    int i = 0;
    while (i < myArray.length) {
      if (numToCheck == myArray[i]) {
        return true;
      }
      i++;
    }
    System.out.println("Your number is not there is the array.");
    return false;
  }
}
