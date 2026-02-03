package bai1;

public class AdminStaff extends Staff implements ICapability {
    private double bonus;

    public AdminStaff(String id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateTotalSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void checkPerformance() {
        System.out.println("Đánh giá hành chính: Dựa trên chỉ số hoàn thành công việc (KPI).");
    }

    public void setBonus(double bonus) { this.bonus = bonus; }
}