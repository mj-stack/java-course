public class MinMax {
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 4, 5, 6};
    checkMax(array1);
    checkMin(array1);
  }

  public static void checkMax(int[] array1) {
    int i = 0;
    int maxNum = array1[0];
    while (i < array1.length) {
      if (array1[i] > maxNum) {
        maxNum = array1[i];
      }
      i++;
    } 
    System.out.println("Max num is: " + maxNum);
  }
  public static void checkMin(int[] array1) {
    int i = 0;
    int minNum = array1[0];
    while (i < array1.length) {
      if (array1[i] < minNum) {
        minNum = array1[i];
      }
      i++;
    } 
    System.out.println("Min num is: " + minNum);
  }
}
