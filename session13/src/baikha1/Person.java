package baikha1;

public class Person {
    String name, email, phone;

    public Person(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Email: " + email + " | Phone: " + phone;
    }
}
