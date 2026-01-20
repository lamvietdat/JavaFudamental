import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String v = sc.nextLine();
        final String regex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*\\.[a-zA-Z]{2,6}$";
        String input = v;
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);
        boolean isMath = matcher.matches();
        System.out.printf("Kết quả so sánh chuỗi \"%s\" là: %s\n", v, isMath ? "khớp" : "không khớp");

    }
}
