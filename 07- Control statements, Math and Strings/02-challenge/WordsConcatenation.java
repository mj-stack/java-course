public class WordsConcatenation {
  public static void main(String[] args) {
    System.out.println("Welcome to strings concatenation");
    String[] stringArray = ArrayUtility.inputStringArray();
    StringBuilder newStr = new StringBuilder();
    for (String str : stringArray) {
      newStr.append(str);
    }
    System.out.println(newStr);
  }
}
