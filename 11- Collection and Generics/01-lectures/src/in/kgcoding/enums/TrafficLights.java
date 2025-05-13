package in.kgcoding.enums;

public enum TrafficLights {
    RED("stop"), GREEN("go"), YELLOW("wait");

    private final String action;

    TrafficLights(String action) {
        this.action = action;
    }
}
