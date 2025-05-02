public class SumAndAvg {
  public static void main(String[] args) {
    System.out.println("Welcome to sum and average: ");
    int[] numArray = ArrayUtility.inputArray();

    int i = 0;
    int sum = 0;
    while (i < numArray.length) {
      sum += numArray[i];
      i++;
    }
    System.out.println("Sum is: " + sum);
    System.out.println("Avg is: " + (sum/numArray.length));
  }
}
