package bai1;

abstract class Staff {
    protected String id;
    protected String name;
    protected double baseSalary;

    public Staff(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateTotalSalary();

    // Getter và Setter để phục vụ chức năng Update
    public String getId() { return id; }
    public void setName(String name) { this.name = name; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    public void displayInfo() {
        System.out.printf("ID: %-5s | Tên: %-15s | Lương cứng: %-10.0f", id, name, baseSalary);
    }
}
