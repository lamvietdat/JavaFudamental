import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên khách hàng: ");
        String khachHang = sc.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String tenSanPham = sc.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        int giaSanPham = sc.nextInt();
        System.out.println("Số lượng mua: ");
        int soLuong = sc.nextInt();
        int giamGia= (giaSanPham*soLuong*10)/100;
        sc.nextLine();
        System.out.println("Khách hàng có thẻ thành viên hay không (true / false) ?");
        String theThanhVien = sc.nextLine();
        boolean theThanh= theThanhVien.equalsIgnoreCase("true");


        System.out.println("Tên khách hàng; "+ khachHang);
        System.out.println("Sản phẩm: "+tenSanPham);
        System.out.println("Nhập giá sản phẩm: "+giaSanPham);
        System.out.println("Số lượng mua: "+soLuong);

        if(theThanh){

            System.out.println("Giảm giá: "+giamGia);
        }else {
            System.out.println("Giảm giá: 0");
        }

        int vat= (giaSanPham*soLuong*8)/100;
        System.out.println("VAT: "+vat);

        int tongTienThanhToan = (giaSanPham*soLuong + vat - giamGia);
        System.out.println("Tổng tiền thanh toán: "+tongTienThanhToan);
    }
}
