import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("firstNumber: ");
        int firstNumber = sc.nextInt();
        System.out.println("secondNumber: ");
        int secondNumber = sc.nextInt();
        System.out.println("firstNumber: " + firstNumber);
        System.out.println("secondNumber: " + secondNumber);
        int tong=firstNumber+secondNumber;
        System.out.println("Tổng = "+tong);
        int hieu=firstNumber-secondNumber;
        System.out.println("Hiệu = "+hieu);
        int tich=firstNumber*secondNumber;
        System.out.println("Tích = "+tich);
        int thuong=firstNumber/secondNumber;
        System.out.println("Thương = "+thuong);
        int du=firstNumber%secondNumber;
        System.out.println("Dư = "+du);
    }
}
