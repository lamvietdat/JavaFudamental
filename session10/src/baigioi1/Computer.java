package baigioi1;

public class Computer {
    public double calculate (double price){
        return price;
    }
    public double calculate (double price,double tax){
        return price*tax;
    }
    public double calculate (double price,double tax,double discount){
        return price*tax*discount;
    }
}
