package bai1;

public class Rectangle {

    private double width;
    private double height;

    // Constructor không tham số
    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    // Constructor có tham số
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getter & Setter (nếu cần)
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return width * height;
    }

    // Phương thức tính chu vi
    public double getPerimeter() {
        return (width + height) * 2;
    }

    // Phương thức in thông tin (optional)
    public void printInfo() {
        System.out.println("Rectangle Info:");
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + getArea());
        System.out.println("Perimeter = " + getPerimeter());
    }

}
