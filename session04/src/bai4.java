import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhâp số phần tử của mang ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int [] arr2 = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.printf("nhap arr[%d] = ",i);
            arr[i]=sc.nextInt();

        }
       int index=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]%2==0){
               arr2[index]=arr[i];
               index++;
           }
       }
       for(int i=0;i<arr.length;i++){
           if(arr[i]%2!=0){
               arr2[index]=arr[i];
               index++;
           }
       }

       for(int i=0;i<arr2.length;i++){
           System.out.println(arr2[i]);
       }
    }
}
