package ra.edu.stu;

import ra.edu.Person;

import java.util.Date;
import java.util.Scanner;

public class Student extends Person {
    private String stuId;
    private String className;
    private String schollName;

    public Student() {
        super(); // goi den constructor khong tham so cua lop cha
    }

    public Student(String name, boolean gender, Date birthday, String address, String stuId, String className, String schollName) {
        super(name, gender, birthday, address);
        this.stuId = stuId;
        this.className = className;
        this.schollName = schollName;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSchollName() {
        return schollName;
    }

    public void setSchollName(String schollName) {
        this.schollName = schollName;
    }

    @Override
    public void input() {
        System.out.println("Nhap ma sinh vien: ");
        Scanner sc = new Scanner(System.in);
        stuId = sc.nextLine();
        System.out.println("Nhap ten lop: ");
        className = sc.nextLine();
        System.out.println("Nhap ten truong: ");
        schollName = sc.nextLine();
        super.input();
    }

    @Override
    public void display() {
        System.out.println("Sinh vien: " );
        System.out.println("\t Ma sinh vien: "+stuId);
        super.display();
        System.out.println("\tLop hoc: "+className);
        System.out.println("\tTruong hoc: "+schollName);
    }
}
