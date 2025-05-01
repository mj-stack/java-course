public class Array {
  public static void main(String[] args) {
    // int[] myArray = new int[5];
    // myArray[0] = 98;
    // myArray[1] = 2;
    // myArray[2] = 8;
    // myArray[3] = 65;
    // myArray[4] = 37;

    int[] myArray = {98, 2, 8, 65, 37};
    // System.out.println(myArray[0]);
    // System.out.println(myArray[1]);
    // System.out.println(myArray[2]);
    // System.out.println(myArray[3]);
    // System.out.println(myArray[4]);

    int i = 0;
    while (i < myArray.length) {
      System.out.println(myArray[i]);
      i++;
    }


    String[] myArr = new String[4];
    myArr[0] = "Mukul Joshi";
    myArr[1] = "Anmol Bisht";
    myArr[2] = "John Doe";
    myArr[3] = "Max Robert";

    System.out.println(myArr[0]);
    System.out.println(myArr[1]);
    System.out.println(myArr[2]);
    System.out.println(myArr[3]);
  }
}
