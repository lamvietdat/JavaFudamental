package baikha1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle("Chữ nhật A", 5.0, 10.0),
                new Circle("Hình tròn B", 7.0)
        };

        // Duyệt mảng bằng vòng lặp for-each
        for (Shape s : shapes) {
            s.displayInfo();
            System.out.printf("Diện tích: %.2f\n", s.getArea());
            System.out.printf("Chu vi: %.2f\n", s.getPerimeter());

            // Kiểm tra xem hình đó có khả năng vẽ (Drawable) không
            if (s instanceof Drawable) {
                ((Drawable) s).draw();
            }
        }
    }
}
