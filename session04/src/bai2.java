import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập phâ tử cho mảng ");
        int n = sc.nextInt();
        int tongchan=0,tongle=0;
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("nhập arr[%d] = ",i);
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                tongchan+=arr[i];
            }
            else{
                tongle+=arr[i];
            }
        }

        System.out.printf("tong chăn = %d   tong le = %d",tongchan,tongle);
    }
}
