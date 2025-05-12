package in.kgcoding.exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        b();
    }

    private static void b() {
        c();
    }

    private static void c() {
        d();
    }

    private static void d() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to division calculator \n");
        System.out.println("Please enter your two numbers: ");
        int first = input.nextInt();
        int second = input.nextInt();

        try {
            int[] a = new int[5];
            System.out.printf("Result is %d", a[6]);
            a[6] = first / second;
            System.out.printf("Result is %d", a[6]);
        }
        // catch (ArithmeticException | ArrayIndexOutOfBoundsException exception) {
        //     System.out.printf("%s , enter valid values", exception.getMessage());
        // }
        catch (Throwable throwable) {
            System.out.println(throwable.getMessage());
            throw throwable;
        }
    }
}
