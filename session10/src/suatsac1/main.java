package suatsac1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("""
                    ================ ZOO MANAGEMENT MENU ================
                    1. Tạo đối tượng và hiển thị thông tin (Kế thừa + super)
                    2. Kiểm tra Overriding: gọi makeSound() của từng con vật
                    3. Kiểm tra Overloading: gọi eat() và eat(String)
                    4. Kiểm tra đa hình runtime (Animal array)
                    5. Gọi phương thức đặc trưng của từng loài
                    0. Thoát chương trình
                    =====================================================
                    Lựa chọn của bạn:
                    """);
            int choice = Integer.parseInt(sc.nextLine());
            dog d = new dog("butDo",10,true);
            elephent e = new elephent("MaMut",10,false);
            cat c = new cat("meo cam",5,true);
            switch (choice) {
                case 1:{

                    d.showInfor();
                    c.showInfor();
                    e.showInfor();
                    break;
                }
                case 2:{
                    d.Makesound();
                    c.Makesound();
                    e.Makesound();
                    break;
                }
                case 3:{
                    d.eat("com");
                    c.eat("ca");
                    e.eat("thưc vật");
                    break;
                }
                case 4:{
                    d.Makesound();
                    System.out.println();
                    c.Makesound();
                    e.Makesound();
                    break;
                }
                case 5:{
                    d.fetchBall();
                    c.climbTree();
                    e.sprayWater();
                    break;
                }
                default:{
                    System.out.println("lựa chọn lại ");
                }
            }
        }
    }
}
