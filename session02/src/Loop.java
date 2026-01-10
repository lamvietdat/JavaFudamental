import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //for - có thể biết trước số vòng lặp
        for (int i = 0; i < 10; i++) {
            // body
            System.out.println(i);
        }

//        int i=0;
//        for ( ; ; ){
//            if(i<10){
//                System.err.println(i);
//            }else {
//                break;
//            }
//            i++;
//        }

        //while  / do - while
        //nhập đến khi nào gặp kí t a hoặc A thì dừng
        char ch = '\0';
        while (!(ch == 'a'|| ch =='A')) {
            //body
            System.out.println();
            System.out.println("Nhập kí tự");
            ch = sc.nextLine().charAt(0);
        }

        do{

            System.out.println();
        }while (!(ch == 'a'|| ch =='A'));

        //câu lệnh nhảy: break
    }
}
