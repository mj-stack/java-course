public class TestPrinter {
    public static void main(String[] args) throws InterruptedException {
        ThreadPrinter t1 = new ThreadPrinter(1);
        ThreadPrinter t2 = new ThreadPrinter(2);
        ThreadPrinter t3 = new ThreadPrinter(3);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();
    }
}
