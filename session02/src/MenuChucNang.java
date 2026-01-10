import java.util.Scanner;

public class MenuChucNang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----MenuChucNang-----");
        System.out.println("Chức năng 1: Tính tổng của n số tự nhiên");
        System.out.println("Chức năng 2: Tình thương của a/b");
        System.out.println("Hãy chọn chức năng");
        int choice = sc.nextInt();

        switch(choice){
            case 1:{
                System.out.println("Nhập n: ");
                int n = sc.nextInt();
                int sum = (n*(n+1))/2;
                System.out.println("Tổng của " + n + " số tự nhiên bằng " + sum );
                break;
            }
            case 2:{
                System.out.println("Nhập tử số: ");
                int a = sc.nextInt();
                System.out.println("Nhập mẫu số: ");
                int b = sc.nextInt();
                if(b==0){
                    System.err.println("Lỗi");
                }else {
                    double thuong = a/b;
                    System.out.println(a + " / " + b + " bằng " + thuong );
                }
            }
        }
    }
}
