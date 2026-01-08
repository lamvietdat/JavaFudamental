import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        //nhấp số (kiểu nguyên thủy)
        System.out.println("Nhập một số nguyên: ");
        int number = Integer.parseInt(sc.nextLine());//tránh việc bị nuốt hàng
        System.out.println("Number = "+number);

        String name ="Nguyễn Văn A";
        //sc.nextLine();
        name = sc.nextLine();
        System.out.println("Name: "+name);

        //Xuất dữ liệu ra màn hình
        System.out.println("In chuỗi bình thường");
        System.out.printf("hello, toi ten la %-20s, nam nay toi %-100d tuoi\n",name,number);
        //kí tự đại diện: %d, %s,%f,%c,%b
        //kí tự điều kiện \n, \t
        //kí tự % và kí tự \: %%,\\
        //kẻ bảng sinh viên : ma SV, ho ten, can nang,tuoi,gioi tinh
        System.out.println("+----------+---------------+--------+-----+----------+");
        System.out.printf("| %-10s | %-15s | %-8s | %-5s | %-10s |\n","MaSV","HoTen","CanNang","Tuoi","Gioitinh");
        System.out.println("+----------+---------------+--------+-----+----------+");
        System.out.printf("| %-10s | %-15s | %-8.1f| %-5s | %-10s |\n","123","Dat",50.1,20,"Nam");
        System.out.println("+----------+---------------+--------+-----+----------+");

        //in màu : mau Ansi
        System.out.printf("%shello, %s jajja");

        sc.close();
    }
}
