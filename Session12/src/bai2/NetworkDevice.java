package bai2;

public class NetworkDevice extends Asset {
    private int numberOfPorts;

    public NetworkDevice(String assetCode, String name, double purchasePrice, int numberOfPorts) {
        super(assetCode, name, purchasePrice);
        this.numberOfPorts = numberOfPorts;
    }

    @Override
    public double getMarketValue() {
        // Khấu hao 10% mỗi năm
        return purchasePrice * 0.9;
    }
}