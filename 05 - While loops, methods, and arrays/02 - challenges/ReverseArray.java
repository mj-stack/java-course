
import java.util.Arrays;

public class ReverseArray {
  public static void main(String[] args) {
    int[] myArray = ArrayUtility.inputArray();
    int[] newArray = reverseArray(myArray);
    System.out.println(Arrays.toString(newArray));
  }

  public static int[] reverseArray(int[] myArray) {
    int[] newArray = new int[myArray.length];
    int i = myArray.length - 1;
    int j = 0;
    while (i >= 0) {
      newArray[j] = myArray[i];
      j++;
      i--;
    }
    return newArray;
  }
}
