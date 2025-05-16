package in.kgcoding.multithreading.sleep;

public class TestingSleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Before sleeping");
        Thread.sleep(10000);
        System.out.println("Woke up");
    }
}
