package baikha1;

abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract double getArea();
    abstract double getPerimeter();

    void displayInfo() {
        System.out.println("\n--- Hình: " + name + " ---");
    }
}
