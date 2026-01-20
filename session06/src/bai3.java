import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name ="";
        String emali="";
        String SDT="";
        String matkhau="";
        while(true){
            System.out.println("""
                    Menu chức năng:
                    - Nhập thông tin người dùng
                    - Chuẩn hóa họ tên
                    - Kiểm tra email hợp lệ
                    - Kiểm tra số điện thoại hợp lệ
                    - Kiểm tra mật khẩu hợp lệ
                    - Thoát
                    Lựa chọn của bạn: [người dùng nhập lựa chọn tại đây]
                    """);

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1: {
                    System.out.print("Nhâp tên ");
                    name = sc.nextLine();
                    System.out.print("nhâp emali ");
                    emali=sc.nextLine();
                    System.out.print("nhập SDT");
                    SDT=sc.nextLine();
                    System.out.print("nhâp mât khẩu ");
                    matkhau= sc.nextLine();
                    break;
                }
                case 2 : {
                    // chuẩn hóa họ tến
                    String n ="";
                   n += name.charAt(0);
                   n=n.toUpperCase();
                   name=n+name.substring(1);
                    System.out.println("tên sau khi đc chuẩn hóa "+name);
                    break;
                }
                case 3 : {
                    final String regex = "^[A-Za-z0-9._%+-]+@email\\.com$\n";
                    String input = emali;
                    Pattern pattern=Pattern.compile(regex);
                    Matcher matcher=pattern.matcher(input);
                    boolean isMath = matcher.matches();
                    System.out.printf("Kết quả so sánh chuỗi \"%s\" là: %s\n", emali, isMath ? "khớp" : "không khớp");
                    break;
                }
                case 4: {
                    final String regex = "^(?:\\+84|0)(?:3[2-9]|5[6|8|9]|7[0|6-9]|8[1-9]|9[0-9])[0-9]{7}$\n";
                    String input = SDT;
                    Pattern pattern=Pattern.compile(regex);
                    Matcher matcher=pattern.matcher(input);
                    boolean isMath = matcher.matches();
                    System.out.printf("Kết quả so sánh chuỗi \"%s\" là: %s\n", emali, isMath ? "khớp" : "không khớp");
                    break;

                }
                case 5: {
                    final String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
                    String input = matkhau;
                    Pattern pattern=Pattern.compile(regex);
                    Matcher matcher=pattern.matcher(input);
                    boolean isMath = matcher.matches();
                    System.out.printf("Kết quả so sánh chuỗi \"%s\" là: %s\n", emali, isMath ? "khớp" : "không khớp");
                    break;
                }

            }

        }
    }
}
