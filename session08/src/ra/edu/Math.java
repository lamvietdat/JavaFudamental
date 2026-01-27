package ra.edu;

public class Math {
    // static: tham chiếu trực tiếp với vùng nhớ static: tồn tại trước khi hàm main chạy
    static int a = 10;
    String name = "Nguyen Van A";

    public static void main(String[] args) {
        System.out.println(a);
//        System.out.println(name);// lỗi vì không có vùng nhows
    }
}
