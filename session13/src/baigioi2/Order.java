package baigioi2;

public class Order {
    String orderId;
    String customerName;

    public Order() {
    }

    public Order(String orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
       return "Mã Đơn: " + orderId + " | Khách hàng: " + customerName;
    }
}
