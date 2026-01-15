import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] arr=null;
        System.out.print("số lương sinh viên phân ");
        int n = sc.nextInt();
        arr=new double[n];
        for(int i=0;i<n;i++){
            System.out.printf("nhập sinh viên %d ",i);
            arr[i]=sc.nextDouble();
        }
        while(true){
            System.out.println("""
                    --- QUẢN LÝ ĐIỂM SINH VIÊN ---
                    -1 Xem tất cả điểm
                    -2 Sắp xếp điểm
                    -3 Tìm kiếm điểm
                    -4 Thống kê điểm
                    -5 Thoát
                    
                    """);
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                {
                   for (int i=0;i<arr.length;i++){
                       System.out.println(arr[i]);
                   }
                   break;
                }
                case 2:{
                    for (int i=0;i<arr.length-1;i++){
                        for (int j=0;j<arr.length-i-1;j++){
                            if(arr[j]>arr[j+1]){
                                double tam =arr[j];
                                arr[j]=arr[j+1];
                                arr[j+1]=tam;
                            }

                        }
                    }
                    break;
                }
                case 3:{
                    System.out.print("nhâp điêm cần tìm ");
                    double a = sc.nextDouble();
                    double [] index=new double [n];
                    int dem=0;
                    for(int i=0;i<arr.length;i++){
                        if(arr[i]==a){
                            index[dem]=i;
                            dem++;
                        }
                    }
                    System.out.printf("số vi trí điểm %f xuất hiện là :",a);
                    for(int i=0;i<index.length;i++){
                        if(index[i]==0){
                            break;
                        }
                        System.out.println(index[i]);
                    }
                    break;

                }
                case 4:{
                    double tb =0;
                    double min =arr[0];
                    double max=arr[0];
                    double tong=0;
                    int dem=0;
                    for(int  i=0;i<arr.length;i++){
                        //tông
                        tong+=arr[i];

                        if(max<arr[i]){
                            max=arr[i];

                        }
                        if(min>arr[i]){
                            min=arr[i];
                        }

                    }
                    tb=tong/n;
                    for(int i=0;i<arr.length;i++){
                        if(arr[i]>=tb){
                            dem++;
                        }
                    }
                    System.out.printf("diêm tung binh la %f \n",tb);
                    System.out.printf("diêm max la %f \n",max);
                    System.out.printf("diêm min la %f \n",min);
                    System.out.printf(" số sinh viên trên tb la  %d \n",dem);
                    break;
                }
                case 5:{return;}
            }

        }
    }
}
