package executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPractice {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        TestingSingleThread task = new TestingSingleThread();

        service.submit(task);
        System.out.println("Task undergo");
        service.shutdown();
    }
}
