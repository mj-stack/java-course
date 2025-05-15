public class Function {
  public static void main(String[] args) {
    // System.out.println("In main method");
    // greetUser();
    // System.out.println("Method callind completed");
    // greetUser();

    LeftHalfPattern();
    // RightHalfPattern();
    // ReverseRHP();
  } 

  public static void  LeftHalfPattern() {
    int star = 0;
    while (star < 5) {
      System.out.print("*");
      
      int i = 0;
      while (i < star) {
        System.out.print(" *");
        i++;
      }
      System.out.println();

      star++;
    }
  }
  public static void RightHalfPattern() {
    System.out.println("        *");
    System.out.println("      * *");
    System.out.println("    * * *");
    System.out.println("  * * * *");
    System.out.println("* * * * *");
  }


  public static void ReverseRHP() {
    System.out.println("* * * * *");
    System.out.println("* * * *");
    System.out.println("* * *");
    System.out.println("* *");
    System.out.println("*");
  }
  
  public static  void  greetUser() {
    System.out.println("Welcome back!");
  }
}
