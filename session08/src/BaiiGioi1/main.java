package BaiiGioi1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("""
                    1. đặt tỷ lệ gia dịch
                    2. lấy tỷ l giao dịch
                    3. chuyển đổi tiên 
                    4.khuyên khích 
                    5 thoát
                    lưa chon:
                    """);
            int choice = sc.nextInt();
            switch (choice){
                case 1:{
                    System.out.print("Nhập Tỷ lệ giao dịch VND :");
                    double VND = sc.nextDouble();
                    CurrencyConverter.dattsetRateyle(VND);
                    break;
                }
                case 2:{
                    CurrencyConverter.getRate();
                    break;
                }
                case 3:{
                    System.out.print("nhâp số tiên muôn chuyên");
                    double NVD =  sc.nextDouble();
                    CurrencyConverter.toUSD(NVD);
                }
                case 4:{

                }
            }

        }
    }
}
