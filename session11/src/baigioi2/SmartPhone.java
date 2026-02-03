package baigioi2;

public class SmartPhone extends Device implements Connectable, Chargeable {
    public SmartPhone(int id, String name) { super(id, name); }

    @Override
    public void turnOn() { System.out.println("Smartphone đang khởi động màn hình cảm ứng..."); }

    @Override
    public void turnOff() { System.out.println("Smartphone đang tắt nguồn..."); }

    @Override
    public void connectWifi() { System.out.println("Smartphone đã kết nối Wifi băng tần 5GHz."); }

    @Override
    public void charge() { System.out.println("Smartphone đang sạc nhanh 65W..."); }
}