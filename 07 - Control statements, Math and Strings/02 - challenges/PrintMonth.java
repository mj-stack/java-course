
import java.util.Scanner;

public class PrintMonth {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to calendar's world \n");
    System.out.print("Enter the year's month in number to find out the month's name: ");
    int num = input.nextInt();
    monthDisplayer(num);
  }

  public static void monthDisplayer(int num) {
    String month;
    switch (num) {
      case 1 -> month = "January";
      case 2 -> month = "February";
      case 3 -> month = "March";
      case 4 -> month = "April";
      case 5 -> month = "May";
      case 6 -> month = "June";
      case 7 -> month = "July";
      case 8 -> month = "August";
      case 9 -> month = "September";
      case 10 -> month = "October";
      case 11 -> month = "November";
      case 12 -> month = "December";
      default -> month = "Invalid";
    }
    System.out.println(month);
  }
}
