import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//      Student s  = new Student();
//      s.name="jack";
//      s.sex=Sex.MALE;
//      s.eat();
//      s.drink();
//      s.talk();
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
        p.inputData(sc);
        p.displayData();
    }
}