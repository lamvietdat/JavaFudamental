package bai5;

public class oder extends Customer{
    private int  orsertId;
    private double total;

    public oder(int id, String name, String email, int orsertId, double total) {
        super(id, name, email);
        this.orsertId = orsertId;
        this.total = total;
    }

    public int getOrsertId() {
        return orsertId;
    }

    public void setOrsertId(int orsertId) {
        this.orsertId = orsertId;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    public void printOder(){
        System.out.println("ID: " + orsertId);
        System.out.println("tông tiền "+total);
        ShowInfo();
    }
}
