package executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadService {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        TestingMultiThread task1 = new TestingMultiThread();
        TestingMultiThread task2 = new TestingMultiThread();
        TestingMultiThread task3 = new TestingMultiThread();
        TestingMultiThread task4 = new TestingMultiThread();
        TestingMultiThread task5 = new TestingMultiThread();

        service.submit(task1);
        service.submit(task2);
        service.submit(task3);
        service.submit(task4);
        service.submit(task5);

        service.shutdown();

        if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
            System.out.println("EMERGENCY SHUTDOWN");
            service.shutdownNow();
        }
    }
}
