package baigioi2;

public class Main {
    public static void main(String[] args) {
        Device[] devices = {
                new SmartPhone(1, "iPhone 15 Pro"),
                new Laptop(2, "MacBook M3"),
                new Television(3, "Sony Bravia 4K")
        };

        System.out.println("=== HỆ THỐNG QUẢN LÝ THIẾT BỊ ===");

        for (Device d : devices) {
            System.out.println("-----------------------------");
            d.showName();
            d.turnOn();

            // Kiểm tra khả năng kết nối Wifi
            if (d instanceof Connectable) {
                ((Connectable) d).connectWifi();
            }

            // Kiểm tra khả năng sạc
            if (d instanceof Chargeable) {
                ((Chargeable) d).charge();
            }

            d.turnOff();
        }
    }
}
