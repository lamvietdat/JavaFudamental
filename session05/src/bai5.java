import java.sql.SQLOutput;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi=null;
        String nhap = "";
        while (true) {
            System.out.println("""
                    **************************** MENU ****************************
                    1. Nhập chuỗi \s
                    2. Đếm số ký tự thường, hoa, số, đặc biệt \s
                    3. Đảo ngược chuỗi \s
                    4. Kiểm tra Palindrome \s
                    5. Chuẩn hóa chuỗi (xóa khoảng trắng dư thừa, viết hoa chữ cái đầu) \s
                    6. Thoát \s
                    **************************************************************
                    Lựa chọn của bạn:
                    
                    """);
            int  choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:{
                    System.out.print("nhâp chuỗi ");
                    chuoi=sc.nextLine();
                    break;
                }
                case 2:{
                    int thuong =0,hoa=0,so=0,dacbiet=0;
                    for(int i=0;i<chuoi.length();i++){
                        if(Character.isUpperCase(chuoi.charAt(i))){
                            hoa++;
                        } else if (Character.isLowerCase(chuoi.charAt(i))) {
                            thuong++;
                        } else if (Character.isLetter(chuoi.charAt(i))) {
                            dacbiet++;
                        }
                        else{
                            so++;
                        }

                    }
                    System.out.println("ký tự in hoa"+hoa);
                    System.out.println("ký tự in thuong"+thuong);
                    System.out.println("ký tự Đặc Biệt "+dacbiet);
                    System.out.println("ký tự số "+so);
                    break;
                }
                case 3:{
                    for (int i = chuoi.length() - 1; i >= 0; i--) {
                        nhap += chuoi.charAt(i);
                    }

                    chuoi=nhap;
                    System.out.println("chuoi đc đao ng "+chuoi);
                    break;
                }

                case 4 :{
                    // chuoi chan
                    if (chuoi.length()%2==0){
                        int index = chuoi.length()/2;
                        String righht = chuoi.substring(0,index);
                        String left = chuoi.substring(index,chuoi.length());
                        String nhap1="";
                        for (int i = righht.length() - 1; i >= 0; i--) {
                            nhap1 += chuoi.charAt(i);
                        }
                        righht=nhap1;
                        if(righht.equals(left)){
                            System.out.printf("Chỗi %s là Palindrome",chuoi);
                        }
                        else{
                            System.out.printf("  Chỗi %s không phai  là Palindrome",chuoi);
                        }
                    }
                    else{
                        int index = chuoi.length()/2 +1;
                        String righht = chuoi.substring(0,index-1);
                        String left = chuoi.substring(index,chuoi.length());
                        String nhap1="";
                        for (int i = righht.length() - 1; i >= 0; i--) {
                            nhap1 += chuoi.charAt(i);
                        }
                        righht=nhap1;
                        if(righht.equals(left)){
                            System.out.printf("Chỗi %s là Palindrome",chuoi);
                        }
                        else{
                            System.out.printf("  Chỗi %s không phai  là Palindrome",chuoi);
                        }

                    }
                    break;
                }
                case 5:{
                    chuoi.trim();
                    String h = "";
                    h += chuoi.charAt(0);
                    h=h.toUpperCase();
                    chuoi=h+chuoi.substring(1);
                    System.out.println(chuoi);
                    break;
                }
                case 6:{return;}

            }
        }
    }
}
