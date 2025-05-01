public class SumAndAvg {
  public static void main(String[] args) {
    int[] myArray = new int[5];
    myArray[0] = 1;
    myArray[1] = 2;
    myArray[2] = 3;
    myArray[3] = 4;
    myArray[4] = 5;

    int i = 0;
    int sum = 0;
    while (i < myArray.length) {
      sum += myArray[i];
      i++;
    }
    System.out.println("Sum is: " + sum);
    System.out.println("Avg is: " + (sum/myArray.length));
  }
}
