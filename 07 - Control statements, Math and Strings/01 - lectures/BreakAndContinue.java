public class BreakAndContinue {
  public static void main(String[] args) {
    System.out.println("Entered in loop");
    for (int i = 0; i < 100; i++) {
      if (i % 2 == 0) {
        continue;
      }
      System.out.println(i);
    }
  }
}
