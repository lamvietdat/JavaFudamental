import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tongNhanVien = 0;
        double tongluong = 0;
        double luongCaoNhat = 0;
        double luongThapNhat = 500;
        double tongTienThuong=0;
        boolean daCoDiuLieu = false;

        while(true){
            System.out.println("----------MENU----------");
            System.out.println("1. Nhập lương nhân viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("Tính tổng số tiền thưởng");
            System.out.println("4. Thoát");

            int chon = sc.nextInt();
            switch (chon){
                case 1:{
                    System.out.println("Chức năng 1: Nhập điểm");
                    System.out.println("Nhập -1 để kết thúc quá trình nhập");

                    while  (true){
                        System.out.println("Nhập lương từ 0 đến 500 triệu: ");
                        double luong = sc.nextDouble();

                        if (luong == -1){
                            System.out.println("Kết thúc quá trình nhập !");
                            break;
                        }
                        if(0 > luong || luong > 500){
                            System.out.println("Lương không hợp lệ! Vui lòng nhập từ 0 đến 500 triệu!");
                            continue;
                        }
                        String xeploai="";
                        if(luong< 5) xeploai= "Thu nhập thấp";
                        else if (luong < 15) xeploai= "Thu nhập trung bình";
                        else if (luong < 50) xeploai= "Thu nhập khá";
                        else xeploai= "Thu nhập cao";
                        System.out.println("Xếp loại: "+xeploai);

                        tongNhanVien++;
                        tongluong += luong;

                        if(luong > luongCaoNhat){
                            luongCaoNhat = luong;
                        }

                        if (luong < luongThapNhat){
                            luongThapNhat = luong;
                        }

                        daCoDiuLieu = true;

                        double luongThuongCaNhan=0;
                        if(luong< 5) luongThuongCaNhan=luong*0.05;
                        else if (luong < 15)  luongThuongCaNhan=luong*0.1;
                        else if(luong < 50) luongThuongCaNhan=luong*0.15;
                        else if (luong < 100) luongThuongCaNhan=luong*0.2;
                        else luongThuongCaNhan=luong*0.25;

                        tongTienThuong += luongThuongCaNhan;
                    }
                    break;
                }

                case 2:{
                    System.out.println("Chức năng 2: Hiển thị thống kê");
                    if (!daCoDiuLieu){
                        System.out.println("Chưa có dữ liệu! Vui lòng chọn 1 để nhập dữ liệu");
                    }else {
                        System.out.println("Số nhân viên đã nhập: "+tongNhanVien);
                        System.out.println("Lương trung bình: "+(tongluong/tongNhanVien));
                        System.out.println("Lương cao nhất: "+luongCaoNhat);
                        System.out.println("Lương thấp nhất: "+luongThapNhat);
                        System.out.println("Tổng tiền lương: "+tongluong);
                    }
                    break;
                }

                case 3:{
                    System.out.println("Chức năng 3: Tính tổng thưởng cho nhân viên");
                    if (!daCoDiuLieu){
                        System.out.println("Chưa có dữ liệu! Vui lòng chọn 1 để nhập dữ liệu");
                    }else {
                        System.out.printf("Tổng thưởng cho nhân viên là : %.2f \n", + tongTienThuong);
                    }
                    break;
                }
                default:{
                    System.out.println("Thoát");
                }
            }
        }

    }
}
