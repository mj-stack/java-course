package traffichandling;

public class TestSignal {
    public static void main(String[] args) throws InterruptedException {
        Signals signal1 = new Signals(TrafficLights.RED);
        Signals signal2 = new Signals(TrafficLights.YELLOW);
        Signals signal3 = new Signals(TrafficLights.GREEN);

        signal1.start();
        signal1.join();

        signal2.start();
        signal2.join();

        signal3.start();
        signal3.join();
    }
}
