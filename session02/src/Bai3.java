import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên bất kỳ: ");
        int n = scanner.nextInt();

        int originalNumber = n;
        if (n < 0) {
            n = -n;
        }
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }

        System.out.println("Tổng các chữ số của " + originalNumber + " là: " + sum);
        scanner.close();
    }
}
