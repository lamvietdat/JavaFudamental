package BaiKha1;

public class SinhVien {
    private int id ;
    private String ten ;
    private int age;

    public SinhVien(int id, String ten, int age) {
        this.id = id;
        this.ten = ten;
        this.age = age;
    }

    public SinhVien() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
