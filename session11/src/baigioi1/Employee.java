package baigioi1;

abstract class Employee {
    protected int id;
    protected String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Mỗi loại nhân viên có cách tính lương khác nhau
    public abstract double calculateSalary();

    public void showInfo() {
        System.out.println("ID: " + id + " | Tên: " + name);
    }
}
