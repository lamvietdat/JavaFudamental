import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double []diem = new double[1000];
        double diemtb =0 , max=0, min =0;
        int count =0;
        int k=0;
        while(true){
            System.out.println("""
                    Menu chức năng:
                    1 Nhập danh sách điểm sinh viên
                    2 In danh sách điểm
                    3 Tính điểm trung bình của các sinh viên
                    4 Tìm điểm cao nhất và thấp nhất
                    5 Đếm số lượng sinh viên đậu và trượt
                    6 Sắp xếp điểm tăng dần
                    7 Thống kê số lượng sinh viên giỏi và xuất sắc
                    8 Thoát
                    """);
            int choice = sc.nextInt();
            switch(choice){
                case 1: {
                    System.out.print("nhâp sô luong ddiem muôn thêm ");
                    int n = sc.nextInt();

                    diem = new double[n];
                    for(int i=0;i<n;i++){
                        System.out.printf("sv %d : ",i);
                        diem[i]=sc.nextDouble();
                    }
                    break;
                }
                case 2: {
                    for(int i=0; i<diem.length; i++){

                        System.out.printf("sv %d : %.2f\n", i, diem[i]);
                    }

                    break;
                }
                case 3: {
                    int tong =0;
                    int so =0;
                    for(int i=0;i< diem.length;i++){
                        tong+=diem[i];
                        so++;
                    }
                    diemtb=tong/so;
                    System.out.printf("điêm trung binh : %f",diemtb);
                    break;
                }
                case 4 : {
                    max= diem[0];
                    min = diem[0];
                    for(int i=0;i< diem.length;i++){
                        if(max<diem[i]){
                            max=diem[i];
                        }
                        if(min>diem[i]){
                            min=diem[i];
                        }
                    }
                    System.out.printf("max = %f",max);
                    System.out.printf("min = %f",min);
                    break;
                }
                case 5: {
                    int dem =0;
                    for(int i=0;i< diem.length;i++){
                        if(diem[i]>=5){
                            dem++;
                        }
                    }
                    System.out.printf(" số sinh viên qua moon  %d",dem);
                }
            }
        }
    }
}
