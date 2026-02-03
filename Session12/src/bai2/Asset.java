package bai2;

abstract class Asset {
    protected String assetCode;
    protected String name;
    protected double purchasePrice;

    public Asset(String assetCode, String name, double purchasePrice) {
        this.assetCode = assetCode;
        this.name = name;
        this.purchasePrice = purchasePrice;
    }

    // Tính giá trị thị trường hiện tại (sau khấu hao)
    public abstract double getMarketValue();

    public String getAssetCode() { return assetCode; }
    public double getPurchasePrice() { return purchasePrice; }
    public void setPurchasePrice(double purchasePrice) { this.purchasePrice = purchasePrice; }

    public void displayBasicInfo() {
        System.out.printf("Mã: %-8s | Tên: %-15s | Giá gốc: %,.0f", assetCode, name, purchasePrice);
    }
}
