package baigioi1;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        Computer c = new Computer();
        System.out.println("gia măc định : "+c.calculate(50000));
        System.out.println("Gia măc định và thuế "+c.calculate(50000,11/10));
        System.out.println("giá mawc đinh công thuê và đc giam giá"+c.calculate(50000,11/10,8/10));
    }
}
