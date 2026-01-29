package ra.edu.emp;

import ra.edu.Person;

import java.util.Date;

public class Employee extends Person {
    private String empId;
    private String department;
    private String company;
    private String position;
    private Double salary;

    public Employee() {
    }

    public Employee(String name, boolean gender, Date birthday, String address, Double salary, String position, String company, String department, String empId) {
        super(name, gender, birthday, address);
        this.salary = salary;
        this.position = position;
        this.company = company;
        this.department = department;
        this.empId = empId;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
