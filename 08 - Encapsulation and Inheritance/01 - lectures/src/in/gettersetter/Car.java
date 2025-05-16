package in.gettersetter;

public class Car {
    private String color; // public
    private String model; // public
    private double fuelLevel;
    private long costOfPurchase; // default

    public Car(String color, String model, long costOfPurchase, double fuelLevel) {
        this.color = color;
        this.model = model;
        this.costOfPurchase = costOfPurchase;
        this.fuelLevel = fuelLevel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equals("Yellow")) {
            System.out.println("Pagal hai kya?");
        } else {
            this.color = color;
        }
    }

    public String getModel() {
        return model;
    }
}
