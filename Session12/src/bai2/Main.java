package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AssetManager manager = new AssetManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========= TECHASSET MANAGEMENT =========");
            System.out.println("1. Nhập tài sản mới");
            System.out.println("2. Xuất báo cáo khấu hao");
            System.out.println("3. Tìm kiếm tài sản (theo Mã hoặc Giá)");
            System.out.println("4. Cập nhật giá gốc tài sản");
            System.out.println("0. Thoát chương trình");
            System.out.print("Chọn chức năng: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                choice = -1; // Xử lý khi người dùng nhập chữ thay vì số
            }

            switch (choice) {
                case 1:
                    System.out.print("Loại tài sản (1.Máy tính / 2.Thiết bị mạng): ");
                    int type = Integer.parseInt(sc.nextLine());
                    System.out.print("Mã tài sản: "); String code = sc.nextLine();
                    System.out.print("Tên tài sản: "); String name = sc.nextLine();
                    System.out.print("Giá mua: "); double price = Double.parseDouble(sc.nextLine());

                    if (type == 1) {
                        System.out.print("RAM: "); String ram = sc.nextLine();
                        System.out.print("CPU: "); String cpu = sc.nextLine();
                        manager.addAsset(new Computer(code, name, price, ram, cpu));
                    } else if (type == 2) {
                        System.out.print("Số cổng: "); int ports = Integer.parseInt(sc.nextLine());
                        manager.addAsset(new NetworkDevice(code, name, price, ports));
                    }
                    break;

                case 2:
                    manager.showReport();
                    break;

                case 3:
                    System.out.print("Bạn muốn tìm theo (1.Mã / 2.Giá tối thiểu): ");
                    int searchType = Integer.parseInt(sc.nextLine());
                    if (searchType == 1) {
                        System.out.print("Nhập mã cần tìm: ");
                        manager.search(sc.nextLine());
                    } else {
                        System.out.print("Nhập mức giá tối thiểu: ");
                        manager.search(Double.parseDouble(sc.nextLine()));
                    }
                    break;

                case 4:
                    System.out.print("Nhập mã tài sản cần sửa giá: ");
                    String uCode = sc.nextLine();
                    System.out.print("Nhập giá mua mới: ");
                    double uPrice = Double.parseDouble(sc.nextLine());
                    manager.updatePrice(uCode, uPrice);
                    break;

                case 0:
                    System.out.println("Đang thoát hệ thống...");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại!");
            }
        } while (choice != 0);

        sc.close();
    }
}
