package baikha2;

public class EWalletPayment extends Payment implements Refundable {
    public EWalletPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Đang thanh toán qua ví điện tử (Quét mã QR...)");
    }

    @Override
    public void refund() {
        System.out.println("-> Đã hoàn tiền về số dư ví điện tử.");
    }
}
