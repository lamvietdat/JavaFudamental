package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Staff> staffList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== EDUCAREER MANAGEMENT MENU =====");
            System.out.println("1. Thêm mới nhân sự");
            System.out.println("2. Hiển thị danh sách & Lương");
            System.out.println("3. Cập nhật thông tin theo ID");
            System.out.println("4. Xóa nhân sự theo ID");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: addStaff(); break;
                case 2: showAll(); break;
                case 3: updateStaff(); break;
                case 4: deleteStaff(); break;
                case 0: System.out.println("Tạm biệt!"); break;
                default: System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }

    private static void addStaff() {
        System.out.print("Chọn loại (1-Giảng viên, 2-Hành chính): ");
        int type = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập ID: "); String id = sc.nextLine();
        System.out.print("Nhập tên: "); String name = sc.nextLine();
        System.out.print("Lương cơ bản: "); double salary = Double.parseDouble(sc.nextLine());

        if (type == 1) {
            System.out.print("Giờ dạy: "); int hours = Integer.parseInt(sc.nextLine());
            staffList.add(new Lecturer(id, name, salary, hours));
        } else {
            System.out.print("Tiền thưởng: "); double bonus = Double.parseDouble(sc.nextLine());
            staffList.add(new AdminStaff(id, name, salary, bonus));
        }
        System.out.println("Thêm thành công!");
    }

    private static void showAll() {
        if (staffList.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        System.out.println("\n--- DANH SÁCH NHÂN SỰ ---");
        for (Staff s : staffList) {
            s.displayInfo();
            System.out.printf(" | TỔNG LƯƠNG: %,.0f VND\n", s.calculateTotalSalary());
            if (s instanceof ICapability) ((ICapability) s).checkPerformance();
        }
    }

    private static void updateStaff() {
        System.out.print("Nhập ID cần sửa: ");
        String id = sc.nextLine();
        for (Staff s : staffList) {
            if (s.getId().equals(id)) {
                System.out.print("Tên mới: "); s.setName(sc.nextLine());
                System.out.print("Lương cơ bản mới: "); s.setBaseSalary(Double.parseDouble(sc.nextLine()));
                if (s instanceof Lecturer) {
                    System.out.print("Giờ dạy mới: "); ((Lecturer) s).setTeachingHours(Integer.parseInt(sc.nextLine()));
                } else if (s instanceof AdminStaff) {
                    System.out.print("Thưởng mới: "); ((AdminStaff) s).setBonus(Double.parseDouble(sc.nextLine()));
                }
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy ID!");
    }

    private static void deleteStaff() {
        System.out.print("Nhập ID cần xóa: ");
        String id = sc.nextLine();
        // Sử dụng removeIf để xóa an toàn (tránh ConcurrentModificationException)
        boolean removed = staffList.removeIf(s -> s.getId().equals(id));
        if (removed) System.out.println("Đã xóa nhân sự.");
        else System.out.println("Không tìm thấy ID!");
    }
}
