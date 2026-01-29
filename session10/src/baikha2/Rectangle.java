package baikha2;

public class Rectangle  extends Shape{
    private double width ;
    private double height ;

    @Override
    public double are() {
         super.are();
         return width*height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
}
