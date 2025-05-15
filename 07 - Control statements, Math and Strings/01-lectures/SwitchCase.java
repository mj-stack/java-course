
import java.util.Scanner;

public class SwitchCase {

  public static void main(String[] args) {
    Scanner dayInput = new Scanner(System.in);
    System.out.println("Welcome to day of the week detector: \n");
    System.out.print("Enter your day in number: ");
    int day = dayInput.nextInt();
    newSwitch(day);
    // oldSwitch(day);
  }

  public static void newSwitch(int day) {
    String dayStr = switch (day) {
      case 1 -> "Monday";
      case 2 -> "Tuesday";
      case 3 -> "Wednesday";
      case 4 -> "Thursday";
      case 5 -> "Friday";
      case 6, 7 -> "Holiday";
      default -> "Invalid day";
    };
    System.out.println("Day: " + dayStr);
  }

  public static void oldSwitch(int day) {
    switch (day) {
      case 1:
        System.out.println("Today is Monday");
        break;
      case 2:
        System.out.println("Today is Tuesday");
        break;
      case 3:
        System.out.println("Today is Wednesday");
        break;
      case 4:
        System.out.println("Today is Thursday");
        break;
      case 5:
        System.out.println("Today is Friday");
        break;
      case 6:
        System.out.println("Today is Satday");
        break;
      case 7:
        System.out.println("Today is Holiday");
        break;
      default:
        System.out.println("Input can only be between 1 - 7");
        break;
    }
  }
}
