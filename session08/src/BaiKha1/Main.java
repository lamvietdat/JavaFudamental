package BaiKha1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien();
        System.out.println("nhâp ID sv :");
        sv.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("nhâp name sv :");
        sv.setTen(sc.nextLine());
        System.out.println("nhâp tuôi sv :");
        sv.setAge(Integer.parseInt(sc.nextLine()));


        System.out.println("thông tin sinh viên ");
        System.out.println(sv.getTen());
        System.out.println(sv.getId());
        System.out.println(sv.getAge());
    }
}
