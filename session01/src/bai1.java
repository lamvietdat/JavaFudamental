import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi =3.14;
        System.out.printf("Nhập vào bán kính: ");
        int n = sc.nextInt();
        double A=pi*n;
        System.out.printf("Diện tích hình tròn bằng " + A);
    }
}
