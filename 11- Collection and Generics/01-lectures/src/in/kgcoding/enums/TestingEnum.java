package in.kgcoding.enums;

public class TestingEnum {

    public static void main(String[] args) {
        TrafficLights color = TrafficLights.GREEN;
        color = TrafficLights.YELLOW;

        Grades grades = Grades.valueOf("D");
        for (Grades value : Grades.values()) {
            System.out.println(value);
        }
    }
}
