package executer;

public class TestingMultiThread implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep((long) (Math.ceil(Math.random() * 5) * 1000));
            System.out.println(Thread.currentThread().getName() + "  \n");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
