package in.knowledgegate;

import in.gettersetter.Car;

public class GetterTest {
    public static void main(String[] args) {
        Car newCar = new Car("Red", "Maruti", 3, 8000);
        newCar.setColor("Yellow");
        System.out.printf("%s %s", newCar.getColor(), newCar.getModel());
    }
}
