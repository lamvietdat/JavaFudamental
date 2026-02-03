package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Drink> menu = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== COFFEESHOP PRO MENU =====");
            System.out.println("1. Thêm món vào Menu");
            System.out.println("2. Hiển thị Menu");
            System.out.println("3. Áp dụng mã giảm giá (%)");
            System.out.println("4. Xóa món khỏi Menu");
            System.out.println("5. Thống kê giá trung bình");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: addDrink(); break;
                case 2: showMenu(); break;
                case 3: applyPromo(); break;
                case 4: deleteDrink(); break;
                case 5: showStatistics(); break;
                case 0: System.out.println("Hẹn gặp lại!"); break;
                default: System.out.println("Lựa chọn sai!");
            }
        } while (choice != 0);
    }

    private static void addDrink() {
        System.out.print("Loại (1.Cà phê, 2.Trà trái cây): ");
        int type = Integer.parseInt(sc.nextLine());
        System.out.print("Mã: "); String id = sc.nextLine();
        System.out.print("Tên: "); String name = sc.nextLine();
        System.out.print("Giá: "); double price = Double.parseDouble(sc.nextLine());

        if (type == 1) menu.add(new Coffee(id, name, price));
        else menu.add(new FruitTea(id, name, price));
        System.out.println("Đã thêm thành công!");
    }

    private static void showMenu() {
        if (menu.isEmpty()) { System.out.println("Menu trống!"); return; }
        System.out.println("\n--- THỰC ĐƠN QUÁN ---");
        for (Drink d : menu) d.displayInfo();
    }

    private static void applyPromo() {
        System.out.print("Nhập % giảm giá: ");
        double pct = Double.parseDouble(sc.nextLine());
        for (Drink d : menu) {
            if (d instanceof IPromotion) {
                ((IPromotion) d).applyDiscount(pct);
            }
        }
        System.out.println("Đã áp dụng giảm giá cho toàn bộ menu!");
    }

    private static void deleteDrink() {
        System.out.print("Nhập mã món cần xóa: ");
        String id = sc.nextLine();
        boolean removed = menu.removeIf(d -> d.getId().equals(id));
        if (removed) System.out.println("Đã xóa món.");
        else System.out.println("Không tìm thấy mã!");
    }

    private static void showStatistics() {
        if (menu.isEmpty()) { System.out.println("Chưa có dữ liệu!"); return; }
        double total = 0;
        for (Drink d : menu) total += d.getPrice();
        double avg = total / menu.size();
        System.out.printf("Tổng số món: %d | Giá trung bình: %,.0f VND\n", menu.size(), avg);
    }
}
