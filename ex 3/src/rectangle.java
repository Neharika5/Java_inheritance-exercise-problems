// Rectangle.java
// Child class Rectangle
public class rectangle extends shape {
    private double length;
    private double width;

    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width;
    }
}
