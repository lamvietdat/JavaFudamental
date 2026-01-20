import java.util.Random;
import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        System.out.println("nhâp độ dai");
        int length= sc.nextInt();
               StringBuilder sb = new StringBuilder();
                Random rand = new Random();

                for (int i = 0; i < length; i++) {
                 sb.append(chars.charAt(rand.nextInt(chars.length())));
                }

                System.out.println("Chuỗi ngẫu nhiên: " + sb.toString());


    }
}
