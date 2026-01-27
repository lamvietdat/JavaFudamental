package BaiiGioi1;

public class CurrencyConverter {
    static double tyle = 25000;
    public static double  dattsetRateyle(double rate){
        if(rate >0 && rate<50000){
            tyle=rate;
        }
        else{
            System.out.println("koddatj yêu câu nhâp lai");
            return tyle;
        }
        return tyle;
    }

    public static void getRate(){
        System.out.println("tỷ giá chuyển đổi là  "+tyle);
    }
    public static void toUSD(double VND){
        System.out.println("USD +:"+VND/tyle);
    }



}
