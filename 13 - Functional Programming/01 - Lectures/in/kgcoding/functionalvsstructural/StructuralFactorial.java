package in.kgcoding.functionalvsstructural;

import java.util.Scanner;

public class StructuralFactorial {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check the factorial: ");
        Integer num = input.nextInt();
        printFactorial(num);
    }
    public static void printFactorial(Integer num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.printf("Factorial for %d is %d", num, factorial);
    }
}
