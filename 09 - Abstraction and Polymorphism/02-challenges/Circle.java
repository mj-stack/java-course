public class Circle extends Shape {
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println(Math.PI * (Math.pow(radius, 2)));
    }
}
