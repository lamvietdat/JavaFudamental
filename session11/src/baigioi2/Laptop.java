package baigioi2;

public class Laptop extends Device implements Connectable, Chargeable {
    public Laptop(int id, String name) { super(id, name); }

    @Override
    public void turnOn() { System.out.println("Laptop đang khởi động hệ điều hành..."); }

    @Override
    public void turnOff() { System.out.println("Laptop đang Shutdown..."); }

    @Override
    public void connectWifi() { System.out.println("Laptop đã kết nối Wifi văn phòng."); }

    @Override
    public void charge() { System.out.println("Laptop đang sạc qua cổng Type-C..."); }
}