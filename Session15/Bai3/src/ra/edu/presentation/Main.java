package ra.edu.presentation;

import ra.edu.exception.*;
import ra.edu.model.Order;
import ra.edu.model.Product;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        Map<String, Order> orderMap = new HashMap<>();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xóa sản phẩm theo id");
            System.out.println("3. Hiển thị sản phẩm");
            System.out.println("4. Tạo đơn hàng");
            System.out.println("5. Thêm sản phẩm vào đơn");
            System.out.println("6. Xem tổng tiền đơn hàng");
            System.out.println("0. Thoát");
            System.out.println("================");
            System.out.print("Lựa chọn của bank: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        Product product = new Product();
                        product.inputData(sc);
                        productList.add(product);
                        System.out.println("✅ Thêm sản phẩm thành công!");
                        break;

                    case 2:
                        System.out.print("Nhập id cần xóa: ");
                        int deleteId = Integer.parseInt(sc.nextLine());
                        boolean removed = productList.removeIf(p -> p.getId() == deleteId);
                        if (!removed) {
                            throw new MyCheckedException("Không tìm thấy sản phẩm");
                        }
                        System.out.println("✅ Xóa thành công!");
                        break;

                    case 3:
                        productList.forEach(Product::displayData);
                        break;

                    case 4:
                        System.out.print("Nhập mã đơn: ");
                        String orderCode = sc.nextLine();
                        orderMap.put(orderCode, new Order(orderMap.size() + 1));
                        System.out.println("✅ Tạo đơn hàng thành công!");
                        break;

                    case 5:
                        System.out.print("Nhập mã đơn: ");
                        String code = sc.nextLine();
                        Order order = orderMap.get(code);
                        if (order == null) {
                            throw new MyCheckedException("Đơn hàng không tồn tại");
                        }

                        System.out.print("Nhập id sản phẩm: ");
                        int pid = Integer.parseInt(sc.nextLine());

                        Product foundProduct = productList.stream()
                                .filter(p -> p.getId() == pid)
                                .findFirst()
                                .orElseThrow(() -> new MyCheckedException("Sản phẩm không tồn tại"));

                        order.addProduct(foundProduct);
                        System.out.println("✅ Thêm sản phẩm vào đơn!");
                        break;

                    case 6:
                        System.out.print("Nhập mã đơn: ");
                        String checkCode = sc.nextLine();
                        Order o = orderMap.get(checkCode);
                        if (o == null) {
                            throw new MyCheckedException("Không tìm thấy đơn hàng");
                        }
                        System.out.println("💰 Tổng tiền: " + o.calculateTotal());
                        break;

                    case 0:
                        System.out.println("👋 Thoát chương trình!");
                        return;

                    default:
                        System.out.println("❌ Lựa chọn không hợp lệ!");
                }

            } catch (NumberFormatException e) {
                System.out.println("❌ Sai định dạng số!");
            } catch (Exception e) {
                System.out.println("❌ " + e.getMessage());
            }
        }
    }
}

