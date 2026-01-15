import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("số phần tử của mảng ");
     ;
        int n=sc.nextInt();
       int [] arr = new int[n];

        for(int i=0;i<n;i++){

            System.out.printf("nập phân tử arr[%d]",i);
            arr[i]=sc.nextInt();

        }

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }
}
