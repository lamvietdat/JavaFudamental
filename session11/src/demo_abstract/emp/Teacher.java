package demo_abstract.emp;

import demo_abstract.Person;

import java.util.Date;

public class Teacher extends Person {
    private int empId;
    private double basicSalary;
    private double salaryRate;
    private double bonus;

    public Teacher() {
    }

    public Teacher(String fullName, Date birthday, double bonus, double salaryRate, double basicSalary, int empId) {
        super(fullName, birthday);
        this.bonus = bonus;
        this.salaryRate = salaryRate;
        this.basicSalary = basicSalary;
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getSalaryRate() {
        return salaryRate;
    }

    public void setSalaryRate(double salaryRate) {
        this.salaryRate = salaryRate;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return basicSalary * salaryRate + bonus;
    }

    @Override
    public double calculateScholaerShip() {
        return 0;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "empId=" + empId +
                ", basicSalary=" + basicSalary +
                ", salaryRate=" + salaryRate +
                ", bonus=" + bonus +
                '}';
    }
}
