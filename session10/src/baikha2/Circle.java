package baikha2;

public class Circle extends Shape{
    private double radius;

    @Override
    public double are() {
        super.are();
        return radius*3.14;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
