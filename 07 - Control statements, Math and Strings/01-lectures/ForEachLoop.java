public class ForEachLoop {
  public static void main(String[] args) {
    String[] array = new String[] {
        "Sita", "Gita", "Laxmi", "Ram", "Shyam", "Mohan"
    };
    // printArray(array);
    printArrayForEach(array);
  }

  public static void printArrayForEach(String[] array) {
    System.out.println("Foreach loop: \n");
    for (String element : array) {
      System.out.println(element + " Ji");
    }
  }

  // public static void printArray(String[] array) {
  // for (int i = 0; i < array.length; i++) {
  // System.out.println(array[i]);
  // }
  // }
}
