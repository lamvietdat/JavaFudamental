package ra.edu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person{
    private String name;
    private boolean gender;
    private Date birthday;
    private String address;

    public Person() {
    }

    public Person(String name, boolean gender, Date birthday, String address) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        name = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gender = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhap ngay sinh: ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            birthday = sdf.parse(sc.nextLine());
        }catch(ParseException e){
            System.out.println("Co loi "+e.getMessage());
        }
        System.out.println("Nhap que quan: ");
        address = sc.nextLine();
    }

    public void display(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\t Ho ten: "+name);
        System.out.println("\t Gioi tinh: "+(gender?"Nam":"Nu"));
        System.out.println("\t Ngay sinh: "+sdf.format(birthday));
        System.out.println("\t Que quan: "+address);
    }
}
