package in.kgcoding.functionalvsstructural;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FunctionalFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check the factorial: ");
        int num = input.nextInt();
        IntStream.rangeClosed(2, num)
                .reduce((a,  b) -> a *b)
                .ifPresent(System.out::println);
    }
}
