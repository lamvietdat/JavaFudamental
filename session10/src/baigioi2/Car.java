package baigioi2;

public class Car {
    private int currentSpeed =0;

    public Car(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public Car() {
    }
    public void accelerate(){
        currentSpeed+=10;
        System.out.println("Car accelerates by default: +10 km/h");
    }
    public void accelerate(int speed){
        currentSpeed+=speed;
        System.out.println( "Car accelerates by " + speed + " km/h");
    }
    public void accelerate (int speed,int second){
        int increase = speed*second;
        currentSpeed+=increase;
        System.out.println("Car accelerates " + increase + " km/h" +(speed *second));
    }
    public void printStatus(){
        System.out.println("Current Speed: " + currentSpeed);
    }
}
