package bai3;

abstract class Drink {
    private String id;
    private String name;
    private double price;

    public Drink(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Phương thức trừu tượng: Mỗi loại đồ uống sẽ có cách pha khác nhau
    public abstract void prepare();

    // Tính đóng gói (Encapsulation) qua Getter và Setter
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public void displayInfo() {
        System.out.printf("ID: %-5s | Tên: %-15s | Giá: %-10.0f VND | Cách pha: ", id, name, price);
        prepare();
    }
}
