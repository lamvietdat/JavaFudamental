package baigioi1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InvoiceManager manager = new InvoiceManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- QUẢN LÝ HÓA ĐƠN ---");
            System.out.println("1. Thêm | 2. Sửa | 3. Xóa | 4. Hiển thị | 5. Thoát");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Mã HD: "); String id = sc.nextLine();
                    System.out.print("Số tiền: "); double amt = Double.parseDouble(sc.nextLine());
                    manager.add(new Invoice(id, amt));
                    break;
                case 2:
                    System.out.print("Vị trí sửa: "); int uIdx = Integer.parseInt(sc.nextLine());
                    System.out.print("Mã mới: "); String uId = sc.nextLine();
                    System.out.print("Tiền mới: "); double uAmt = Double.parseDouble(sc.nextLine());
                    manager.update(uIdx, new Invoice(uId, uAmt));
                    break;
                case 3:
                    System.out.print("Vị trí xóa: ");
                    manager.delete(Integer.parseInt(sc.nextLine()));
                    break;
                case 4:
                    manager.display();
                    break;
                case 5: return;
            }
        }
    }
}
