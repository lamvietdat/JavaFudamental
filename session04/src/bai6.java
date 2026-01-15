import java.util.Arrays;
import java.util.Scanner;

public class bai6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] arr=null;
        double tong=0;

        int dem =0;
        double tb=0;
        System.out.println("so luong lương cần nhập là :");
        int n = sc.nextInt();
        arr=new double[n];
        double min=arr[0];
        double max=arr[0];
        for(int i=0;i<n;i++){
            System.out.printf("arr[%d] = ",i);
            arr[i]=sc.nextDouble();
        }
        while (true)
        {
            System.out.println("""
                    QUẢN LÝ LƯƠNG NHÂN VIÊN
                    - Xem danh sách lương
                    - Sắp xếp lương
                    - Tìm kiếm lương cụ thể
                    - Thống kê lương
                    - Thoát
                    Lựa chọn của bạn:
                    """);
            int choine = sc.nextInt();
            switch (choine){
                case 1:{
                       for(int i=0;i<arr.length;i++){
                           System.out.printf( "arr[%d] = %f ",i,arr[i] );
                       }
                       break;
                }
                case 2:{
                    for(int i=0;i<arr.length-1;i++){
                        for(int j=0;j<arr.length-i-1;j++){
                            if(arr[j]>arr[j+1]){
                                double tam = arr[j];
                                arr[j] = arr[j+1];
                                arr[j+1] = tam;
                            }
                        }
                    }
                    break;
                }
                case 3:{
                    System.out.println("nhap so luong bạn muôn tim kiếm");
                    double luong = sc.nextDouble();
                    int [] index=new int[n];
                    int vitri=0;
                    for(int i=0;i<arr.length;i++){
                        if(arr[i]==luong){
                            index[vitri++]=i;
                            vitri++;
                        }
                    }
                    System.out.printf("vị trí mà luong %f xuấ hiên là ",luong);
                    System.out.println(Arrays.toString(index));
                }
                break;
                case 4:{
                    for(int i=0;i<arr.length;i++){
                        //
                        tong +=arr[i];
                        //max
                        if(arr[i]>max){
                            max=arr[i];
                        }

                        if(arr[i]<min){
                            min=arr[i];
                        }

                    }
                    tb=tong/n;
                    for(int i=0;i<arr.length;i++){
                        if(arr[i]>=tb){
                            dem++;
                        }
                    }
                    System.out.printf("tông luong là %f \n",tong);
                    System.out.printf(" luong max là %f \n",max);
                    System.out.printf(" luong min là %f \n",min);
                    System.out.printf(" luong trung bing la  là %f \n",tb);
                    System.out.printf(" số ng có lương cao hơn tb  là %d \n",dem);
                    break;
                }
                case 5:{return;}

            }

        }
    }
}
