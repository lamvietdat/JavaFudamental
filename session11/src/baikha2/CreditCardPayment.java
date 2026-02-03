package baikha2;

public class CreditCardPayment  extends Payment implements Refundable {
    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Đang xử lý thanh toán qua thẻ tín dụng (Gateway kết nối...)");
    }

    @Override
    public void refund() {
        System.out.println("-> Đã hoàn tiền vào thẻ tín dụng của khách hàng.");
    }
}
