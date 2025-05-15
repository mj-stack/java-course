public class SumPositives {
  public static void main(String[] args) {
    System.out.println("Welcome to positive number added \n");
    int[] array = ArrayUtility.inputArray();
    positiveAdded(array);
  }

  public static void positiveAdded(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] < 0) {
        continue;
      }
      sum += array[i];
    }
    System.out.println("Sum is " + sum);
  }
}
