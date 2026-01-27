package bai1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nhập chiều rộng: ");
        double w = sc.nextDouble();
        System.out.print("Nhập chiều cao: ");
        double h = sc.nextDouble();


        Rectangle rect = new Rectangle(w, h);


        System.out.println("Diện tích = " + rect.getArea());
        System.out.println("Chu vi = " + rect.getPerimeter());


        rect.printInfo();

    }
}
