public class Variable {
    public static void main(String[] args) {
        // cú pháp khai báo và khởi tạo
        //datatype + name = value;
        int number = 10;
        int numberA, numberB, positive, $number, _number;
        float point = 7.5f;
        double mark = 7.5;
        System.out.println("Giá trị của biến là: " + number);
        System.out.println("Giá trị của point bằng "+point);
        System.out.println("Giá trị của mark bằng "+mark);
        //hằng số
        final byte choice = 10;
        System.out.println("Giá trị của choice bằng "+choice);
        //phép gán : dùng để thay đổi giá trị biến
        point= 10.5f;
        //ép kiểu ngầm định khi ép kểu từ giá trị nhỏ sang lớn
        mark = number;
        number = (int)mark;// tràn dữ liệu -> ép kiểu tường mình
        //toán tử gán
        point -= 1.5; // nó sẽ tương với point - 1.5
        //toán tử so sánh luôn trả về kiểu boolean
        //toán tử logic: || hoặc hoặc, &&, !
        boolean result= true||false||2>3||false; // result = true
        boolean rs= 2>3 && 3>4 && 4>5;
        boolean not = !true; //false
        //toán tử tăng giảm : ++, -- : tiền tố(sau khi tăng hoặc giảm) và hậu tố(truước khi tangw hoặc giảm)
        int a =10;
        a--;
        System.out.println("a= "+(a--));
        System.out.println(a-- %3 + a++ + a-- * a++);
        //toán tử 3 ngôi
        int dtb = 5>4? 100: 0;
    }
}
