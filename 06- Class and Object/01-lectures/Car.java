public class Car {
  int noOfWheels; 
  String color;
  float maxSpeed;
  float currentFuelInLiters;
  int noOfSeats;

  public Car start() {
    if (currentFuelInLiters == 0) {
      System.out.println("Car is out of fuel, cannot start");
    } else if (currentFuelInLiters < 5) {
      System.out.println("Car is in reserved mode, plese refuel");
    } else {
      System.out.println("Car is started.... vroom...");
    }

    return this;
  }

  public void drive() {
    currentFuelInLiters--;
    System.out.println("Car is driving");
  }

  public void addFuel(float currentFuelInLiters) {
    this.currentFuelInLiters += currentFuelInLiters;
  }

  public float getCurrentFuelLevel() {
    return currentFuelInLiters;
  }
}
