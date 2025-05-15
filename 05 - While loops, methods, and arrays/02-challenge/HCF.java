
import java.util.Scanner;

public class HCF {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("HCF/GCD caculator: ");
    System.out.print("Enter first num: ");
    int first = input.nextInt();
    System.out.print("Enter first num: ");
    int second = input.nextInt();
    int hcf = calcualteHCF(first, second);
    System.out.println("HCF is: " + hcf);
  }

  public static int calcualteHCF(int first, int second) {
    int gcd = 1;
    int i = 2;
    int least = least(first, second);
    while (i <= least) {
      if ((first%i == 0) && (second%i == 0)) {
        gcd = i;
      }
      i++;
    }
    return gcd;
  }

  public static int least(int first, int second) {
    if (first < second) {
      return first;
    } else {
      return second;
    }
  }
}
