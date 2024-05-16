package testing;

abstract class Shape {

    protected int x;
    protected int y;

    Shape() {
        x = 0;
        y = 0;
    }

    public abstract double area();

    void printPosition(){
        System.out.println("X -> " + x + " Y -> "+y);
    }

    void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
