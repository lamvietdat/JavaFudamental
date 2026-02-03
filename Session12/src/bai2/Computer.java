package bai2;

public class Computer extends Asset {
    private String ram;
    private String cpu;

    public Computer(String assetCode, String name, double purchasePrice, String ram, String cpu) {
        super(assetCode, name, purchasePrice);
        this.ram = ram;
        this.cpu = cpu;
    }

    @Override
    public double getMarketValue() {
        // Khấu hao 20% mỗi năm (Giả định tính cho năm đầu tiên)
        return purchasePrice * 0.8;
    }
}