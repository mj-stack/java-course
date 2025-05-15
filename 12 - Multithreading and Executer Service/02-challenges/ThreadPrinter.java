public class ThreadPrinter extends Thread {
    public final int threadNumber;

    public ThreadPrinter(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.printf("%s is started. Thread no %d \n", Thread.currentThread().getName(), threadNumber-1);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%s is ended. Thread no %d \n", Thread.currentThread().getName(), threadNumber-1);
    }
}
