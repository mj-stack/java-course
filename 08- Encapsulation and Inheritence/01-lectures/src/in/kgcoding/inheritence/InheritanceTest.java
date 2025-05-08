package in.kgcoding.inheritence;

import in.kgcoding.TwoWheeler;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();

        TwoWheeler two = new TwoWheeler();
        two.commute();
        two.balance();

        MotorCycle bike = new MotorCycle();
        bike.commute();
        bike.balance();
        bike.start();
    }
}
