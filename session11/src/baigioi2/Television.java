package baigioi2;

public class Television extends Device implements Connectable {
    public Television(int id, String name) { super(id, name); }

    @Override
    public void turnOn() { System.out.println("Tivi đang hiển thị biểu trưng hãng..."); }

    @Override
    public void turnOff() { System.out.println("Tivi đã vào chế độ chờ (Standby)."); }

    @Override
    public void connectWifi() { System.out.println("Tivi đang kết nối mạng để xem Youtube."); }
}