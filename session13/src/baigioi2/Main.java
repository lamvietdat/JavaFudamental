package baigioi2;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    OrderManager manager = new OrderManager();
    Scanner sc = new Scanner(System.in);

    while (true) {
        System.out.println("\n--- QUẢN LÝ ĐƠN HÀNG ---");
        System.out.println("1. Thêm | 2. Sửa | 3. Xóa | 4. Hiển thị | 5. Thoát");
        System.out.print("Chọn: ");
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                System.out.print("Nhập mã đơn: "); String id = sc.nextLine();
                System.out.print("Nhập tên khách: "); String name = sc.nextLine();
                manager.add(new Order(id, name));
                break;
            case 2:
                System.out.print("Vị trí cần sửa: "); int uIdx = Integer.parseInt(sc.nextLine());
                System.out.print("Mã mới: "); String uId = sc.nextLine();
                System.out.print("Khách mới: "); String uName = sc.nextLine();
                manager.update(uIdx, new Order(uId, uName));
                break;
            case 3:
                System.out.print("Vị trí cần xóa: ");
                manager.delete(Integer.parseInt(sc.nextLine()));
                break;
            case 4:
                manager.display();
                break;
            case 5:
                System.out.println("Tạm biệt!");
                return;
        }
    }
}
}