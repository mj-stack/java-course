public class Square extends Shape{
    public int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        int area;
        System.out.println(Math.pow(side, 2));
    }
}
