package testing;

public class Square extends Shape {

    protected double side;

    Square(double side) {
        this.side = side;
    }


    @Override
    public double area() {
        return side * side;
    }
}
