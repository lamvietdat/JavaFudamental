public class Student {
    String studentId;
    String name;
    String phoneNumber;
    String email;
    Sex sex;

    // Phương thức khởi tạo
    public Student(){
        // phương thức khởi tạo không tham số, mặc định nếu không khai báo
    }

    public Student(String id){
        studentId = id;
    }

    // Các phương thức khác
    public void eat(){
        System.out.println(name + " is eating.");
    }

    public void drink(){
        System.out.println(name + " is drinking.");
    }

    public void talk(){
        System.out.println(name + " is talking.");
    }

    public void doHomework(){
        System.out.println(name + " is doing homework.");
    }

    public void attendClass(){
        System.out.println(name + " is attending class.");
    }

}
