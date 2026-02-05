package baikha1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- QUẢN LÝ NGƯỜI DÙNG ---");
            System.out.println("1. Thêm | 2. Xóa theo Email | 3. Hiển thị | 4. Thoát");
            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {
                // CHỨC NĂNG THÊM
                System.out.print("Nhập tên: "); String name = sc.nextLine();
                System.out.print("Nhập email: "); String email = sc.nextLine();
                System.out.print("Nhập SĐT: "); String phone = sc.nextLine();
                list.add(new Person(name, email, phone));
                System.out.println("Thêm thành công!");

            } else if (choice == 2) {
                // CHỨC NĂNG XÓA
                System.out.print("Nhập email cần xóa: ");
                String emailDel = sc.nextLine();
                boolean removed = list.removeIf(p -> p.email.equalsIgnoreCase(emailDel));
                System.out.println(removed ? "Đã xóa xong." : "Không tìm thấy email!");

            } else if (choice == 3) {
                // CHỨC NĂNG HIỂN THỊ
                System.out.println("--- DANH SÁCH NGƯỜI DÙNG ---");
                list.forEach(System.out::println);

            } else break;
        }
    }
}
