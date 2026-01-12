import java.util.Scanner;

public class Bai2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int soLuongSVI = 0;
            double tongDiem = 0;
            double diemCaoNhat = 0;
            double diemThapNhat = 10;
            boolean daCoDuLieu = false;

            while (true) {
                // --- HIỂN THỊ MENU ---
                System.out.println("\n********** MENU NHẬP ĐIỂM **********");
                System.out.println("1. Nhập điểm học viên");
                System.out.println("2. Hiển thị thống kê");
                System.out.println("3. Thoát");
                System.out.print("Lựa chọn của bạn: ");

                int chon = sc.nextInt();

                switch (chon) {
                    case 1:
                        System.out.println("\n--- CHỨC NĂNG 1: NHẬP ĐIỂM ---");
                        System.out.println("Nhập -1 để kết thúc quá trình nhập.");

                        while (true) {
                            System.out.print("Nhập điểm (0-10): ");
                            double diem = sc.nextDouble();

                            // 1. Kiểm tra điều kiện thoát
                            if (diem == -1) {
                                System.out.println("Đã dừng nhập.");
                                break;
                            }

                            // 2. Validate điểm (phải từ 0 đến 10)
                            if (diem < 0 || diem > 10) {
                                System.out.println("Điểm không hợp lệ! Vui lòng nhập từ 0 đến 10.");
                                continue; // Quay lại đầu vòng lặp while
                            }

                            // 3. Xử lý xếp loại ngay khi nhập xong
                            String xepLoai = "";
                            if (diem < 5) xepLoai = "Yếu";
                            else if (diem < 7) xepLoai = "Trung Bình";
                            else if (diem < 8) xepLoai = "Khá";
                            else if (diem < 9) xepLoai = "Giỏi";
                            else xepLoai = "Xuất sắc";

                            System.out.println("-> Xếp loại: " + xepLoai);

                            // 4. Cập nhật thống kê
                            soLuongSVI++;
                            tongDiem += diem;

                            // Cập nhật Max
                            if (diem > diemCaoNhat) {
                                diemCaoNhat = diem;
                            }
                            // Cập nhật Min
                            if (diem < diemThapNhat) {
                                diemThapNhat = diem;
                            }

                            daCoDuLieu = true; // Đánh dấu là đã có dữ liệu
                        }
                        break;

                    case 2:
                        System.out.println("\n--- CHỨC NĂNG 2: THỐNG KÊ ---");
                        if (!daCoDuLieu) {
                            System.out.println("Chưa có dữ liệu! Vui lòng chọn chức năng 1 trước.");
                        } else {
                            System.out.println("Số học viên đã nhập: " + soLuongSVI);
                            System.out.println("Điểm trung bình: " + (tongDiem / soLuongSVI));
                            System.out.println("Điểm cao nhất: " + diemCaoNhat);
                            System.out.println("Điểm thấp nhất: " + diemThapNhat);
                        }
                        break;

                    case 3:
                        System.out.println("Đang thoát chương trình...");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Chức năng không tồn tại! Vui lòng chọn 1, 2 hoặc 3.");
                }
            }
        }
}

