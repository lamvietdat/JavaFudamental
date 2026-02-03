package baikha1;

public class Rectangle extends Shape implements Drawable {
    private double width, height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() { return width * height; }

    @Override
    double getPerimeter() { return 2 * (width + height); }

    @Override
    public void draw() {
        System.out.println("Vẽ hình chữ nhật: [Dài: " + height + ", Rộng: " + width + "]");
    }
}
