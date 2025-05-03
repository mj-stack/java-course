public class TwoDSumAndAvg {
  public static void main(String[] args) {
    System.out.println("Welcome to 2D sum and average: \n");
    int[][] numsArr = ArrayUtility.input2DArray();
    long sum = sum(numsArr);
    double average = average(numsArr);
    System.out.println("Sum is: " + sum);
    System.out.println("Average is: " + average);
  }

  public static long sum(int[][] numsArr) {
    int sum = 0;
    int i = 0;
    while (i < numsArr.length) {
      int j = 0;
      while (j < numsArr[i].length) {
        sum += numsArr[i][j];
        j++;
      }
      i++;
    }
    return sum;
  } 

  public static double average(int[][] numsArr) {
    if (numsArr.length == 0) {
      return 0;
    }
    long sum = sum(numsArr);
    int rows = numsArr.length;
    int cols = numsArr[0].length;
    return sum/(rows*cols);
  } 
}
