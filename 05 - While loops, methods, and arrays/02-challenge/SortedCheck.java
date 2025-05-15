public class SortedCheck {
  public static void main(String[] args) {
    System.out.println("Checking sorted array in ascending order");
    int[] myArr = new int[5];
    myArr[0] = 15;
    myArr[1] = 5;
    myArr[2] = 25;
    myArr[3] = 45;
    myArr[4] = 35;
    int[] myArr2 = {1, 2, 3, 4, 5};
    checkSorted(myArr);
    checkSorted(myArr2);
  }

  public static void checkSorted(int[] array) {
    int i = 0;
    while (i < array.length - 1) {
      if (array[i] > array[i + 1]) {
        System.out.println("This array is not sorted");
        return;
      }
      i++;
    }
    System.out.println("This array is sorted");
  }
}
