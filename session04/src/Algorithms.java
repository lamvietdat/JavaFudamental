import java.util.Arrays;
import java.util.Random;

public class Algorithms {
    public static void main(String[] args) {
        //Thuật toán tìm kiếm tuyến tính
        //sử dụng vòng lặp for dể duyệt + kiểm tra điều kiện tìm kiếm với if

        //tạo random 1 mảng số nguyên 100 phần tử
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        //in mảng
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.printf("%d ", array[i]);
            }
        }

        //tạo mảng lưu trữ 20 số nguyên tố đầu tiên
        //tìm và lưu 20 số đầu tien
//        int n = 0;
//        boolean isPrime = true;
//        if(n<2){
//            isPrime = false;
//        }else {
//            for (int i = 2; i <= Math.sqrt(n); i++) {
//                if(n%i==0){
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//        if(isPrime){
//            System.out.println(" số nguyên tố");
//        }else {
//            System.out.println("Không phải số nguyên tố");
//        }
//        int[] arrayPrime= new int[20];
//        int n = 2;
//        int count = 0;
//        while(count < 20 ){
//            boolean isPrime = true;
//            for (int i = 2; i <= Math.sqrt(n); i++) {
//                if(n%i==0){
//                    isPrime = false;
//                    break;
//                }
//            }
//        if(isPrime) {
//            array[count++] = n;
//        }
//            n++;
//        }
//        System.out.println(Arrays.toString(arrayPrime));
//        }

        //Thuật toán sắp xếp nổi bọt:
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if(array[j] == array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }


    }
}
