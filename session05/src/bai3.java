import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai3 {
    public static void main(String[] args) {
        System.out.println("nhâp mât khẩu");
        Scanner sc=new Scanner(System.in);
        String matkhau = sc.nextLine();
        final String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$!%])[A-Za-z\\d@#$!%]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(matkhau);

        if (matcher.matches()) {
            System.out.println("Mật khẩu hợp lệ");
        } else {
            System.out.println("Mật khẩu không hợp lệ");
        }

    }
}
