package baigioi2;

import java.util.ArrayList;

public class OrderManager implements Manage<Order> {
    private ArrayList<Order> list = new ArrayList<>();

    @Override
    public void add(Order item) {
        list.add(item);
    }

    @Override
    public void update(int index, Order item) {
        if (index >= 0 && index < list.size()) {
            list.set(index, item);
        } else System.out.println("Vị trí không tồn tại!");
    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        } else System.out.println("Vị trí không tồn tại!");
    }

    @Override
    public void display() {
        if (list.isEmpty()) System.out.println("Danh sách đơn hàng trống.");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ". " + list.get(i));
        }
    }
}