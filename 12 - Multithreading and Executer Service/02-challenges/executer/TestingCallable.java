package executer;

import java.util.concurrent.*;

public class TestingCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        CallableServicePractice task1 = new CallableServicePractice(5);
        CallableServicePractice task2 = new CallableServicePractice(4);
        CallableServicePractice task3 = new CallableServicePractice(3);

        Future<Integer> fact1 = service.submit(task1);
        Future<Integer> fact2 = service.submit(task2);
        Future<Integer> fact3 = service.submit(task3);

        System.out.println(fact1.get());
        System.out.println(fact2.get());
        System.out.println(fact3.get());
        service.shutdownNow();

        if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
            service.shutdownNow();
        }
    }
}
