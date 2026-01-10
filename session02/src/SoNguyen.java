import java.util.Scanner;

public class SoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do{
            System.out.println("Nhập vào số nguyên : ");
            number = sc.nextInt();
            if(number <0){
                System.err.println("Lỗi vui lòng nhập lại số > 0");
            }
        }while (number<0);
    }
}
