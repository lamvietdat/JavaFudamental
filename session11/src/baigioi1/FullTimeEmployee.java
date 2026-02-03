package baigioi1;

public class FullTimeEmployee extends Employee implements BonusEligible {
    private double baseSalary;

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public double calculateBonus() {
        // Thưởng mặc định 10% lương cơ bản
        return baseSalary * 0.1;
    }
}