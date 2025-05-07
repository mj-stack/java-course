public class CarFinal {
  final int noOfWheels;
  final String model;
  final String engineInLiters;

  public CarFinal(int noOfWheels, String model, String engineInLiters) {
    this.noOfWheels = noOfWheels;
    this.model = model;
    this.engineInLiters = engineInLiters;
  }

  public static void main(String[] args) {

    CarFinal car = new CarFinal(4, "Sedan", "2.0L");
    System.out.println("Number of wheels: " + car.noOfWheels);
    System.out.println("Car model: " + car.model);
    System.out.println("Engine capacity: " + car.engineInLiters);
  }
}
