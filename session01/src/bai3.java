import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phân số thứ nhất: ");
        System.out.println("Nhập tử số thứ nhất: ");
        int tuSo1 = sc.nextInt();
        System.out.println("Nhập mẫu số thứ nhất: ");
        int mauSo1 = sc.nextInt();
        System.out.println("Phân số thứ nhất: "+tuSo1 +"/"+ mauSo1);

        System.out.println("Nhập phân sô thứ hai: ");
        System.out.println("Nhập tử số thứ hai: ");
        int tuSo2 = sc.nextInt();
        System.out.println("Nhập mẫu số thứ hai: ");
        int mauSo2 = sc.nextInt();
        System.out.println("Phân số thứ nhất: "+tuSo2 +"/"+ mauSo2);

        int tuMoi=(tuSo1*mauSo2)+(tuSo2*mauSo1);
        int mauMoi=mauSo1*mauSo2;

        System.out.println("Tổng hai phân số = "+tuMoi+"/"+mauMoi);
    }
}
