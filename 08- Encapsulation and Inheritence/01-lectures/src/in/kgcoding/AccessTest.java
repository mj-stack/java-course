package in.kgcoding;

public class AccessTest {
  public static void main(String[] args) {
    Car car = new Car();
    car.color = "red";
    car.model = "swift";
    System.out.println(car.costOfPurchase);

    Car newCar = new Car("Black", "BMW", 1, 5000);
    System.out.println(newCar);

    Default def = new Default();
  }
}
