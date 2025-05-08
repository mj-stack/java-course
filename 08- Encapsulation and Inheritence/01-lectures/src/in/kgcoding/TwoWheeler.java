package in.kgcoding;

import in.kgcoding.inheritence.Vehicle;

public class TwoWheeler extends Vehicle {
    public TwoWheeler() {
        setNoOfTyres(2);
        noOfTyres = 4;
    }

    public void balance() {
        System.out.println("I am balancing on two tyres");
    }
}
