public class StringDemo {
    public static void main(String[] args) {
        //String là một class trong java
        String name =  "Nguyen Van A";
        //String trong java vừa có tính nguyên thủy vừa có tính tham chiếu
        //Cách 1 : khởi tạo trực tiếp
        String str1 = "Hello world"; //khởi tạo theo hướng nguyên thủy (String pool)
        String str2 = "Hello world";

        System.out.println("Địa chỉ str1"+System.identityHashCode(str1));
        System.out.println("Địa chỉ str2"+System.identityHashCode(str2));

        //Cách 2: khởi tạo thông qua từ khóa new(CẤp phát động)
        String str3= new String("Hello world");// khởi tạo theo hướng tham chiều
        String str4= new String("Hello world");

        //in ra địa chỉ của biến
        System.out.println("Địa chỉ str3"+System.identityHashCode(str3));
        System.out.println("Địa chỉ str4"+System.identityHashCode(str4));

        //Các phương thức thường dùng của String
        //length(), charArt(), substring(), indexOf(), toLowerCase(), toUpperCase(), trim(), replace(), split()
        //equals(), equalsIgnoreCase(), compareTo(), contains(),

        //Phần 1: Các phương thức xử lý và biến đổi chuỗi
        String str = "  Xin chao Java  ";
        String text = "hoc,lap,trinh";

        System.out.println("Chuỗi gốc: [" + str + "]");

        // 1. length(): Trả về độ dài của chuỗi (bao gồm cả khoảng trắng)
        int doDai = str.length();
        System.out.println("1. length(): " + doDai);

        // 2. charAt(index): Lấy ký tự tại vị trí index (bắt đầu từ 0)
        char kyTu = str.charAt(2); // Vị trí 2 là chữ 'X' (vì 2 khoảng trắng đầu là 0,1)
        System.out.println("2. charAt(2): " + kyTu);

        // 3. trim(): Xóa khoảng trắng thừa ở đầu và cuối chuỗi
        String daTrim = str.trim();
        System.out.println("3. trim(): [" + daTrim + "]");

        // 4. toLowerCase(): Chuyển toàn bộ về chữ thường
        System.out.println("4. toLowerCase(): " + daTrim.toLowerCase());

        // 5. toUpperCase(): Chuyển toàn bộ về chữ hoa
        System.out.println("5. toUpperCase(): " + daTrim.toUpperCase());

        // 6. indexOf(str): Tìm vị trí xuất hiện đầu tiên của chuỗi con
        int viTri = daTrim.indexOf("Java");
        System.out.println("6. indexOf(\"Java\"): " + viTri);

        // 7. substring(start, end): Cắt chuỗi từ vị trí start đến trước end
        // Cắt từ vị trí 9 đến hết chuỗi "Java"
        String chuoiCon = daTrim.substring(9);
        System.out.println("7. substring(9): " + chuoiCon);

        // 8. replace(old, new): Thay thế ký tự hoặc chuỗi
        String thayThe = daTrim.replace("Java", "Android");
        System.out.println("8. replace(): " + thayThe);

        // 9. split(regex): Tách chuỗi thành mảng dựa trên ký tự phân cách
        System.out.print("9. split(\",\"): ");
        String[] cacTu = text.split(","); // Tách dựa trên dấu phẩy
        for (String tu : cacTu) {
            System.out.print("[" + tu + "] ");
        }
        System.out.println();

        //Phần 2: Các phương thức so sánh và kiểm tra
        String s1 = "Java";
        String s2 = "java";
        String s3 = "Java";
        String cauVan = "Toi yeu lap trinh Java";

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        // 10. equals(): So sánh bằng tuyệt đối (phân biệt hoa thường)
        boolean ketQua1 = s1.equals(s2); // false vì 'J' khác 'j'
        System.out.println("10. s1.equals(s2): " + ketQua1);

        // 11. equalsIgnoreCase(): So sánh bằng (bỏ qua hoa thường)
        boolean ketQua2 = s1.equalsIgnoreCase(s2); // true
        System.out.println("11. s1.equalsIgnoreCase(s2): " + ketQua2);

        // 12. compareTo(): So sánh thứ tự từ điển (trả về số nguyên)
        // Nếu s1 < s2 trả về số âm, s1 > s2 trả về số dương, bằng nhau trả về 0
        // Trong bảng mã ASCII: 'J' (74) < 'j' (106)
        int ketQua3 = s1.compareTo(s2);
        System.out.println("12. s1.compareTo(s2): " + ketQua3);

        // 13. contains(): Kiểm tra chuỗi cha có chứa chuỗi con không
        boolean chuaChuoi = cauVan.contains("lap trinh");
        System.out.println("13. cauVan.contains(\"lap trinh\"): " + chuaChuoi);
    }
}
