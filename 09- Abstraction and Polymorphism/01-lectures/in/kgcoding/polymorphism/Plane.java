package in.kgcoding.polymorphism;

class Plane extends Vehicle {
    @Override
    public void start() {
        super.start();
        System.out.println("Plane is taking off");
    }
}
