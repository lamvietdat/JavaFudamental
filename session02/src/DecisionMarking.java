import java.util.Scanner;

public class DecisionMarking {
    public static void main(String[] args) {
        // if , else if else
        //dieu kien phai la mot bieu thuc tra ve kieu boolean
        Scanner scanner = new Scanner(System.in);
        int a ;
        System.out.println("Nhập giá trị của a; ");
        a = Integer.parseInt(scanner.nextLine());
//        if (a>0){
//            //thuc hien khi dieu kien dung
//            System.out.println("A lon hon 0");
//        } else if (a >-10) {
//            System.out.println("A nho hon hoac bang 0 va lon hon -10");
//        }else {
//            System.out.println("A nho hon hoac bang -10");
//        }

        //toán tử ba ngôi
//        int result = a>0 ? 0 : a >- 10 ? 1 : 2;
//        switch (result){
//            case 0:
//            case 1:
//            default:
//        }

        //switch
        //biểu thức xét điều kiện phải trả về giá trị: number, numberic, chả , string
        switch(a){
            //xét tưng trường hợp
            case 0:
            {
                //thực hiện khi a=0
                System.out.println("a bằng 0");
                break;
            }
            case 1:{
                System.out.println("a bằng 1");
                break;
            }
            default:{
                System.out.println("Kh co trường hợp nào thảo mãn");
            }
        }

//        if (a==0){
//
//        }else if (a==1){
//
//        }else {
//
//        }
    }
}
