
import java.util.Arrays;

public class MergeArrays {
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3};
    int[] array2 = {3, 4, 5};
    int[] mergedArray = mergeArrays(array1, array2);
    System.out.println("Merged array is: " + Arrays.toString(mergedArray));
  }  

  public static int[] mergeArrays(int[] array1, int[] array2) {
    int[] mergedArray = new int[array1.length + array2.length];
    int i = 0;
    while (i < array1.length) {
      mergedArray[i] = array1[i];
      i++;
    }
    int j = array1.length;
    int k = 0;
    while (j < array2.length + array1.length) {
      mergedArray[j] = array2[k];
      j++;
      k++;
    }
    return mergedArray;
  }
}
