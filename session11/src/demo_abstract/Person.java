package demo_abstract;

import java.util.Date;

public abstract class Person {
    private String fullName;
    private Date birthday;

    public Person() {
    }

    public Person(String fullName, Date birthday) {
        this.fullName = fullName;
        this.birthday = birthday;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public abstract double calculateSalary();
    public abstract double calculateScholaerShip();
}
