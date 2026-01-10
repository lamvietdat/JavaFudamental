import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 trong 12 tháng để xem tháng đó có bao nhiêu ngày");
        int thang = Integer.parseInt(sc.nextLine());

        switch (thang) {
            case 1:
            case 3:
                case 5:
                    case 7:
                        case 8:
                            case 10:
                                case 12:
                                    System.out.println("Tháng có 31 ngày");
                                    break;

                                    case 2:
                                        System.out.println("Tháng có 28 hoặc 29 ngày");
            case 4:
            case 6:
            case 9:
                case 11:
                    System.out.println("Tháng có 30 ngày");
                    break;
        }
    }
}
