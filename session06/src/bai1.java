import java.util.Arrays;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 10000;
        String[] sv = new String[max];
        int index = 0;
        while (true) {
            System.out.println("""
                    📋 MENU CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN
                    - Thêm tên sinh viên
                    - Hiển thị danh sách
                    - Tìm tên sinh viên chứa từ khóa
                    - Đếm số sinh viên có tên bắt đầu bằng chữ cái nhập vào
                    - Sắp xếp danh sách tên theo thứ tự A-Z
                    - Thoát chương trình
                    
                    """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1: {
                    System.out.print("sô sv bạn muốn nhâp : ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.printf(" nhập sinh vien thư %d : ", i);
                        sv[index] = sc.nextLine();
                        index++;
                    }
                    break;
                }
                case 2: {
                    for (int i = 0; i < sv.length; i++) {
                        if (sv[i] == null) {
                            break;
                        }
                        System.out.printf("sv[%d] = %s \n", i, sv[i]);
                    }
                    break;
                }
                case 3: {
                    System.out.print(" nhâp tên sv muôn tim ");
                    String search = sc.nextLine();
                    int vitri = 0;
                    String[] nhap = new String[sv.length];
                    for (int i = 0; i < sv.length; i++) {
                        if (sv[i] == null) {
                            break;
                        }
                        if (sv[i].contains(search)) {
                            nhap[vitri] = sv[i];
                            vitri++;
                        }
                    }
                    for (int i = 0; i < nhap.length; i++) {
                        if (nhap[i] == null) {
                            break;
                        }
                        System.out.printf("sv[%d] = %s \n", i, nhap[i]);
                    }
                    break;
                }
                case 4: {
                    System.out.print(" nhâp tên sv muôn tim ");
                    String search = sc.nextLine();
                    int vitri = 0;
                    for (int i = 0; i < sv.length; i++) {
                        if (sv[i] == null) {
                            break;
                        }
                        if (sv[i].contains(search)) {
                            vitri++;
                        }
                    }
                    System.out.printf("sô sinh viên la %d \n", vitri);
                    break;
                }
                case 5: {
                    // Tạo mảng mới chỉ chứa các phần tử đã nhập
                    String[] nhap = Arrays.copyOf(sv, index);

                    // Sắp xếp mảng
                    Arrays.sort(nhap);

                    // Ghi đè lại vào sv
                    for (int i = 0; i < nhap.length; i++) {
                        sv[i] = nhap[i];
                    }

                    System.out.println("Danh sách sau khi sắp xếp:");
                    for (int i = 0; i < index; i++) {
                        System.out.printf("sv[%d] = %s \n", i, sv[i]);
                    }
                    break;
                }




                case 6: {
                    return;
                }
            }
        }
    }

}