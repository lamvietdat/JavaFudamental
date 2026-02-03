package bai2;

import java.util.ArrayList;

public class AssetManager {
    private ArrayList<Asset> list = new ArrayList<>();

    // 1. Nhập tài sản (Thêm mới)
    public void addAsset(Asset a) {
        list.add(a);
        System.out.println(">>> Đã thêm tài sản thành công!");
    }

    // 2. Xuất báo cáo (Hiển thị danh sách)
    public void showReport() {
        if (list.isEmpty()) {
            System.out.println("Danh sách tài sản đang trống.");
            return;
        }
        System.out.println("\n--- BÁO CÁO GIÁ TRỊ TÀI SẢN ---");
        for (Asset a : list) {
            showValue(a);
        }
    }

    // --- Đa hình: Hiển thị thông tin và giá trị sau khấu hao ---
    public void showValue(Asset a) {
        a.displayBasicInfo();
        // Gọi getMarketValue() - Tính đa hình (Overriding) thực thi tại đây
        System.out.printf(" | GT khấu hao: %,.0f VND\n", a.getMarketValue());
    }

    // --- Overloading 1: Tìm kiếm theo mã (String) ---
    public void search(String code) {
        boolean found = false;
        for (Asset a : list) {
            if (a.getAssetCode().equalsIgnoreCase(code)) {
                showValue(a);
                found = true;
            }
        }
        if (!found) System.out.println("Không tìm thấy mã: " + code);
    }

    // --- Overloading 2: Tìm kiếm theo giá tối thiểu (double) ---
    public void search(double minPrice) {
        boolean found = false;
        System.out.println("Tài sản có giá gốc > " + String.format("%,.0f", minPrice) + ":");
        for (Asset a : list) {
            if (a.getPurchasePrice() > minPrice) {
                showValue(a);
                found = true;
            }
        }
        if (!found) System.out.println("Không có tài sản nào thỏa mãn.");
    }

    // 4. Sửa giá mua (Tìm mã và cập nhật)
    public void updatePrice(String code, double newPrice) {
        for (Asset a : list) {
            if (a.getAssetCode().equalsIgnoreCase(code)) {
                a.setPurchasePrice(newPrice);
                System.out.println(">>> Cập nhật giá gốc thành công cho mã " + code);
                return;
            }
        }
        System.out.println("Không tìm thấy mã tài sản để cập nhật.");
    }

    public ArrayList<Asset> getList() { return list; }
}
