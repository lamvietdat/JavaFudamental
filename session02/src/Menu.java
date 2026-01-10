import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------Menu---------");
        System.out.println("1. Tính giai thừa của n");
        System.out.println("2. Tình tổng cảu n số hạng đầu tiên");
        System.out.println("3. Tìm các ước cảu 1 số");
        System.out.println("4. Thoát");
        int choice = sc.nextInt();
        switch(choice){
            case 1: {
                System.out.println("Nhập n: ");
                int n1=sc.nextInt();
                long giaiThua=1;
                if(n1<0){
                    System.err.println("Vui lòng nhập số lớn hơn 0");
                }else {
                    for(int i=1;i<=n1;i++){
                        giaiThua *=i;
                    }
                    System.out.println("Giai thừa cửa " +  n1 + " là: " );
                }
                break;
            }

            case 2: {
                System.out.print("Nhập số n để tính tổng: ");
                int n2 = sc.nextInt();
                long tong = 0;
                for (int i = 1; i <= n2; i++) {
                    tong += i;
                }
                System.out.println("Tổng từ 1 đến " + n2 + " là: " + tong);
                break;
            }
            case 3:
                System.out.print("Nhập số n để tìm ước: ");
                int n3 = sc.nextInt();
                System.out.print("Các ước của " + n3 + " là: ");
                for (int i = 1; i <= n3; i++) {
                    if (n3 % i == 0) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
                break;
            case 4:
                System.out.println("Đã thoát chương trình.");
                break;
        }
    }
}
