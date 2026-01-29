package suatsac2;

public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void showInformation(){
        System.out.println("brand:"+brand);
        System.out.println("year:"+year);
    }
    public void move(){
        System.out.println("Vehicle is moving");
    }
    public void move1(){
        System.out.println("Vehicle is moving 1");
    }
    public void move2(int speed ){
        System.out.println("Vehicle is moving with speed "+speed);
    }
    public void startEngine(){
        System.out.println("Vehicle is starting");
    }
    public void stopEngine(){}
}
