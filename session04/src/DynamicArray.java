import java.util.Scanner;



public class DynamicArray   {

    static  final int Max = 1000;
    public static void main(String[] args) {
        //Mảng trong java là cố định
        //quản lí mảng: thêm sửa xóa tìm kiếm phần tử trong 1 mảng

        int[] array = new int[Max];
        int n = 0;

    }

    public static  void add(int[] array, int n, int value, int idx){
        //1,2,3,4,5 => chem 100 tai idx băằng 2
        if(n >= Max){
            System.out.println("Mảng đa đâyf");
        }else {
            //dich cac phan ben phai vi tri can chen sang phai 1 o
            for(int i = n; i > idx; i--){
                array[i] = array[i-1];
            }
            array[idx] = value;
        }
    }
}
