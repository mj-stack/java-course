package traffichandling;

public class Signals extends Thread{
    public final TrafficLights trafficSignal;

    public Signals(TrafficLights trafficSignal) {
        this.trafficSignal = trafficSignal;
    }

    @Override
    public void run() {
        if (trafficSignal == TrafficLights.RED) {
            System.out.println("Light id red, stop for 5 seconds");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else if (trafficSignal == TrafficLights.YELLOW) {
            System.out.println("Light is now yellow, wait for 2 seconds");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Light is green, you can go");
        }
    }
}
