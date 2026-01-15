import java.util.Scanner;

public class Baithuchanh {
        public static void main(String[] args) {
            //Khai báo mảng số nguyên có 10 phần tử
            int [] arrInt = new int[10];
            int [] arrInt1 = new int[]{1,2,3,4,5,6,7};//cú pháp đầy đủ

            //2 thành phần của mảng: Phần tử và vị trí
            //Lấy phần tử dựa theo vị trí
            System.out.printf("Phần tử tại index = 2 là: \n" +arrInt[2]);
            arrInt[2]=100;
            System.out.printf("Phần tử tại index = 2 là: \n" +arrInt[2]);

            //Mảng 2 chiều
            int[][]  arr2D =  new int[10][5];
            int[][]  arr2D1 = {{1,2,3,4,5},{6,7,8,9,0}};
            //phần tử có giá trị bằng 5

            System.out.println("array idex "+arr2D1[0][4]);

            //Duyệt mảng: duyệt qua từng giá trị trong mảng
            for (int i = 0; i < arrInt1.length; i++) {
                System.out.println("Array[i] "+arrInt1[i]);
            }

            for(int i = 0 ; i < arr2D1.length ; i++){
                for(int j = 0 ; j < arr2D1[i].length ; j++){
                    System.out.println(arr2D1[i][j]);
                }
            }

            //Tạo mảng lưu trữ danh sách điểm thi của 10 môn học nhập từ bàn phím
            //Duyệt mảng thực hiện tính: Điểm trung bình, điểm cao nhất, điểm thấp nhất của sinh viên
            Scanner sc = new Scanner(System.in);
            double [] diem = new double[10];
            for (int i = 0; i < diem.length; i++) {
                System.out.printf("Nhập điểm môn học thứ "+ (i+1) + " :" );
                diem[i] = sc.nextDouble();
            }
            for (int i = 0 ; i < diem.length ; i++){
                System.out.println("Điểm môn học thứ " + (i+1) + " là:" + diem[i]);
            }

            double tong = 0;
            double maxdiem=diem[0];
            double mindiem=diem[0];
            for (int i = 0 ; i < diem.length ; i++){
                tong += diem[i];
                if (diem[i]>maxdiem){
                    maxdiem=diem[i];
                }
                if (diem[i]<mindiem){
                    mindiem=diem[i];
                }
            }
            double diemtrungbinh = tong/diem.length;

            System.out.println("mindiemtrungbinh "+mindiem);
            System.out.println("maxdiemtrungbinh "+maxdiem);
            System.out.println("diemtrungbinh "+diemtrungbinh);
        }
}

