import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                // 1. Nhập 3 cạnh từ bàn phím
                System.out.print("Nhập cạnh thứ nhất: ");
                int a = scanner.nextInt();
                System.out.print("Nhập cạnh thứ hai: ");
                int b = scanner.nextInt();
                System.out.print("Nhập cạnh thứ ba: ");
                int c = scanner.nextInt();

                // 2. Kiểm tra tính hợp lệ của tam giác
                // Điều kiện: 3 cạnh phải dương VÀ tổng 2 cạnh bất kỳ lớn hơn cạnh còn lại
                if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {

                    // 3. Phân loại tam giác (Lưu ý thứ tự ưu tiên)

                    // Priority 1: Tam giác đều (3 cạnh bằng nhau)
                    if (a == b && b == c) {
                        System.out.println("Kết quả: Đây là Tam giác đều.");
                    }
                    // Priority 2: Tam giác cân (Có ít nhất 2 cạnh bằng nhau)
                    // Lưu ý: Đã kiểm tra 'đều' ở trên rồi, nên xuống đây chắc chắn không phải đều
                    else if (a == b || a == c || b == c) {
                        System.out.println("Kết quả: Đây là Tam giác cân.");
                    }
                    // Priority 3: Tam giác vuông (Định lý Pytago: bình phương 1 cạnh = tổng bình phương 2 cạnh kia)
                    else if ((a * a == b * b + c * c) ||
                            (b * b == a * a + c * c) ||
                            (c * c == a * a + b * b)) {
                        System.out.println("Kết quả: Đây là Tam giác vuông.");
                    }
                    // Priority 4: Tam giác thường
                    else {
                        System.out.println("Kết quả: Đây là Tam giác thường.");
                    }

                } else {
                    // Thông báo lỗi nếu không thỏa mãn điều kiện tam giác
                    System.out.println("Ba cạnh không tạo thành tam giác.");
                }

                scanner.close();
    }
}


