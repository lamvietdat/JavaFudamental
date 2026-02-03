package bai3;

public class Coffee extends Drink implements IPromotion {
    public Coffee(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public void prepare() {
        System.out.println("Pha bằng máy.");
    }

    @Override
    public void applyDiscount(double percentage) {
        double newPrice = getPrice() * (1 - percentage / 100);
        setPrice(newPrice);
    }
}