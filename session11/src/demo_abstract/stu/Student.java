package demo_abstract.stu;

import demo_abstract.IPerson;
import demo_abstract.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person implements IPerson {
    private String stuId;
    private double averageMark;

    public Student() {
    }

    public Student(String fullName, Date birthday, String stuId, double averageMark) {
        super(fullName, birthday);
        this.stuId = stuId;
        this.averageMark = averageMark;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public Student(String stuId) {
        this.stuId = stuId;
    }
    @Override
    public double calculateSalary() {
        return 0;
    }

    @Override
    public double calculateScholaerShip() {
        if(averageMark > 9){
            return 5000000;
        } else if (averageMark >= 8) {
            return 50000;
        }
        return 0;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien");
        stuId = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        setFullName(sc.nextLine());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nhap ngay sinh");
        try{
            setBirthday(sdf.parse(sc.nextLine()));
        }catch(ParseException e){
            throw new RuntimeException(e);
        }
        System.out.println("Nhap diem trung binh ");
        averageMark = sc.nextDouble();
    }

    @Override
    public void display() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}
