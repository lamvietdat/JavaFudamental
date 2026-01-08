import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập width: ");
        float width=sc.nextFloat();
        System.out.println("Nhập height: ");
        float height=sc.nextFloat();

        float area=width*height;
        System.out.println("Diện tích bằng: "+area);

        float perimeter=2*(width+height);
        System.out.println("Chu vi bằng: "+perimeter);
    }
}
