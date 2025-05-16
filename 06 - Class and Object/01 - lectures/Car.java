public class Car {
  static int noOfCarsSold;
  int noOfWheels; 
  String color;
  float maxSpeed;
  float currentFuelInLiters;
  int noOfSeats;

  static {
    noOfCarsSold = 0;
    System.out.println("I am in static block");
  }
  {
    noOfCarsSold++;
    System.out.println("I am in init block");
  }

  Car(String color) {
    this.color = color;
    noOfWheels = 4;
    maxSpeed = 150;
    currentFuelInLiters = 2;
    noOfSeats = 5;
  }

  Car() {
    this("Black");
    currentFuelInLiters = 5;
  }

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
