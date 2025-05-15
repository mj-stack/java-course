package in.kgcoding.polymorphism;

class Car extends Vehicle {

    Car() {
        super();
    }
    Car(int noOfTyres) {
        super(noOfTyres);
    }

    public int noOfDoors() {
        return 5;
    }

    @Override
    public void start() {
        System.out.println(super.getNoOfTyres());
        System.out.println("Car is starting");
    }
}
