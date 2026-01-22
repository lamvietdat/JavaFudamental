import java.util.Scanner;

public class Product {
    String maSanPham ;
    String tenSanPham;
    String moTa;
    double price;
    int tonKho;
    stau trangThai;

    public Product(String maSanPham, String tenSanPham, String moTa, double price, int tonKho, stau trangThai) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.moTa = moTa;
        this.price = price;
        this.tonKho = tonKho;
        this.trangThai = trangThai;
    }

    public Product() {
    }
    public void inputData(Scanner sc ) {

        System.out.print("nhập mã sản phẩm ");
        maSanPham = sc.nextLine();
        System.out.print("nhập Tền sản phẩm ");
        tenSanPham = sc.nextLine();
        System.out.print("nhập mô tả sản phẩm ");
        moTa = sc.nextLine();
        System.out.print("nhập giá  sản phẩm ");
        price = sc.nextDouble();
        System.out.print("nhập tồn kho sản phẩm ");
        tonKho = sc.nextInt();
        System.out.print("nhập trạng thái sản phẩm ");
        trangThai=stau.An;
    }
    public void displayData() {
        System.out.println("Ma san pham: " + maSanPham);
        System.out.println("Ten san pham: " + tenSanPham);
        System.out.println("Mo ta: " + moTa);
        System.out.println("Price: " + price);
        System.out.println("Ton Kho: " + tonKho);
        System.out.println("Trang Thai: " + trangThai);

    }
}
