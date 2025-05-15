package in.kgcoding.abstraction;

public class Car extends Vehicle{
    private int noOfDoors;

    public Car() {
        super(4);
    }

    @Override
    public void makeStartSound() {
        System.out.println("vroom....");
    }

    @Override
    public void getSetGo() {
        System.out.println("Going to place...");
    }
}
