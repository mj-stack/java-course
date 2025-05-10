package in.kgcoding.polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car();
//        Vehicle v = new Vehicle();
        Plane p = new Plane();

        // castTest(v);
        castTest(c);
        castTest(p);
        // Vehicle vCar = new Car();
    }

    public static void castTest(Vehicle veh) {
//        Car cVehicle = (Car) veh;
        veh.start();
//        System.out.println(veh.noOfDoors());
    }
}
