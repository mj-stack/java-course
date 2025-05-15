
import java.util.Scanner;

public class LCM {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to LCM calculator!\n");
    System.out.print("Enter the first num: ");
    int first = input.nextInt();
    System.out.print("Enter the second num: ");
    int second = input.nextInt();
    int lcm = getLcm(first, second);
    System.out.println("LCM is: " + lcm);
  } 

  public static int getLcm(int first, int second) {
    int i = 1;
    while (true) {
      int factor = i * first;
      if(factor%second == 0) {
        return factor;
      }
      i++;
    }
  } 
}
