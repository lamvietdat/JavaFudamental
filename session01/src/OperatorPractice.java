import java.util.Scanner;

public class OperatorPractice {
    public static void main(String[] args) {
        // viết một logic khởi tạo ba cạnh của một tam giác hợp lệ
        //sử dụng công thức heron để tính diện tích và chu vi (math)

        //viết một logic khởi tạo 3 hệ số a,b,c cho phương trình bậc hai
        //áp dụng công thức giải ptrinh bậc 2

        //in các kết quả ra màn hình
        double a= 10;
        double b= 20;
        double c= 30;
        System.out.println("Cạnh a bằng " +a);
        System.out.println("Cạnh b bằng " +b);
        System.out.println("Cạnh c bằng " +c);
        double chuVi=a+b+c;
        System.out.println("Chu vi bằng " +chuVi);
        double nuaChuVi=(a+b+c)/2;
        double dienTich=Math.sqrt(nuaChuVi*(nuaChuVi-a)*(nuaChuVi-b)*(nuaChuVi-c));
        System.out.println("Diện tích bằng "+dienTich);

        a=1;
        b=4;
        c=3;
        double delta=Math.pow(b,2)-4*a*c;
        System.out.println("Delta bằng "+delta);
        double x1= (-b+Math.sqrt(delta))/(2*a);
        double x2= (-b-Math.sqrt(delta))/(2*a);
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
    }
}
