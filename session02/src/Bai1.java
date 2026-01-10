import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên dương: ");
        int n = Integer.parseInt(sc.nextLine());
        int tong = 0;
        if( n <= 0){
            System.out.println("Vui lòng nhập số lớn hơn 0 !");
        }else {
            for (int i = 1; i <= n; i++) {
                tong += i;
            }
            System.out.println("Tổng của " + n + "số nguyên dương là : " + tong);
        }
    }
}
