package mj.interfacepractice;

public abstract class TestPrimeNumber implements PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber checkPrime = num -> {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(checkPrime.checkPrime(11));
    }
}
