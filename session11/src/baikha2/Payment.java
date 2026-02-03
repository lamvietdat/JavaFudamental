package baikha2;

abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    // Mỗi loại thanh toán sẽ có cách xử lý (pay) khác nhau
    public abstract void pay();

    public void printAmount() {
        System.out.println("Số tiền giao dịch: " + amount + " VND");
    }
}
