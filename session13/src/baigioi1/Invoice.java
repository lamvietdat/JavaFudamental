package baigioi1;

public class Invoice {
    String id;
    double amount;

    public Invoice(String id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Mã HD: " + id + " | Số tiền: " + amount;
    }

    public Invoice() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
