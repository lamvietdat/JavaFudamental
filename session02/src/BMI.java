import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập  weight: ");
        double weight = sc.nextDouble();
        System.out.println("Nhập height: ");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Độ BMI= " + bmi);
        if (bmi < 16) {
            System.out.println("Gầy độ 3");
        }else if (16 <= bmi && bmi <= 16.9) {
            System.out.println("Gầy độ 2");
        }else if (17 <= bmi && bmi <= 18.4) {
            System.out.println("Gầy độ 1");
        } else if (18.5 <= bmi && bmi <= 24.9 ) {
            System.out.println("Bình thường");
        } else if (30 <= bmi && bmi <= 34.9) {
            System.out.println("Béo phì độ 1");
        } else if (35 <= bmi && bmi <= 39.9) {
            System.out.println("Béo phì độ 2");
        }else {
            System.out.println("Béo phì độ 3");
        }

    }
}
