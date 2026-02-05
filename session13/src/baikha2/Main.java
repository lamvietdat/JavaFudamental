package baikha2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AttendanceManager manager = new AttendanceManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ĐIỂM DANH ---");
            System.out.println("1. Thêm | 2. Sửa | 3. Xóa | 4. Hiển thị | 5. Thoát");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên sinh viên: ");
                    manager.add(new Student(sc.nextLine()));
                    break;
                case 2:
                    System.out.print("Nhập vị trí cần sửa: ");
                    int idxEdit = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập tên mới: ");
                    manager.update(idxEdit, new Student(sc.nextLine()));
                    break;
                case 3:
                    System.out.print("Nhập vị trí cần xóa: ");
                    manager.delete(Integer.parseInt(sc.nextLine()));
                    break;
                case 4:
                    manager.display();
                    break;
                case 5:
                    return;
            }
        }
    }
}
