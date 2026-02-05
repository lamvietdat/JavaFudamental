package baikha2;

import java.util.ArrayList;

public class AttendanceManager implements Manage<Student> {
    private ArrayList<Student> list = new ArrayList<>();

    @Override
    public void add(Student item) { list.add(item); }

    @Override
    public void update(int index, Student item) {
        if (index >= 0 && index < list.size()) list.set(index, item);
        else System.out.println("Vị trí không hợp lệ!");
    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index < list.size()) list.remove(index);
        else System.out.println("Vị trí không hợp lệ!");
    }

    @Override
    public void display() {
        if (list.isEmpty()) System.out.println("Danh sách trống.");
        else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i + ". " + list.get(i));
            }
        }
    }
}