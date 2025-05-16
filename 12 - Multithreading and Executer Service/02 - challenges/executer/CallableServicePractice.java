package executer;

import java.util.concurrent.Callable;

public class CallableServicePractice implements Callable<Integer> {
    private final Integer number;

    public CallableServicePractice(Integer number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(number * 1000);
        return findFactorial(number);
    }

    private static Integer findFactorial(Integer number) {
        Integer factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
