public class TwoDDiagonalSum {
  public static void main(String[] args) {
    System.out.println("Welcome to 2D Diagonal sum: \n");
    int[][] myArray = ArrayUtility.input2DArray();
    int sum = calculateSum(myArray);
    System.out.println("Sum is: " + sum);
  }

  public static int calculateSum(int[][] myArray) {
    int sum = 0;
    int i = 0;
    while (i < myArray.length) {
      int j = 0;
      while (j < myArray[i].length) {
        if ((i == j) || (i + j == 2)) {
          sum += myArray[i][j];
        }
        j++;
      }
      i++;
    }
    sum -= myArray[i/2][i/2];
    return sum;
  }
}
