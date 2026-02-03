package baikha2;

public class Main {
    public static void main(String[] args) {
        Payment[] transactions = {
                new CashPayment(200000),
                new CreditCardPayment(1500000),
                new EWalletPayment(50000)
        };

        System.out.println("=== HỆ THỐNG XỬ LÝ GIAO DỊCH ===");

        for (Payment p : transactions) {
            System.out.println("-----------------------------");
            p.printAmount(); // Gọi phương thức chung từ lớp cha
            p.pay();         // Gọi phương thức đa hình

            // Kiểm tra "khả năng mở rộng": Nếu đối tượng có implement Refundable
            if (p instanceof Refundable) {
                Refundable refundableObj = (Refundable) p; // Ép kiểu để sử dụng khả năng refund
                refundableObj.refund();
            } else {
                System.out.println("(!) Lưu ý: Phương thức này không hỗ trợ hoàn tiền hệ thống.");
            }
        }
    }
}
