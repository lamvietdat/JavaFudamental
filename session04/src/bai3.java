import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhâp số phần tử của mang ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.printf("nhap arr[%d] = ",i);
            arr[i]=sc.nextInt();

        }
        for(int i=1;i<arr.length;i++){
            int curentelmemt =arr[i];
            int k;
            for( k=i-1;k>=0 && arr[k]>curentelmemt;k--){
                arr[k+1]=arr[k];

            }
        arr[k+1]=curentelmemt;}
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
