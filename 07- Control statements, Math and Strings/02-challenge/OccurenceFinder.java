public class OccurenceFinder {
  public static void main(String[] args) {
    int[] myArray = { 2, 4, 4, 4, 6, 6, 6, 6, 6 };
    int num = 4;
    int occurrence = 0;
    for (int i : myArray) {
      if (i == num) {
        occurrence++;
      }
    }
    System.out.println(num + " occurred " + occurrence + " times.");
  }
}
