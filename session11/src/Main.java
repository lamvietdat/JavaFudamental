import demo_abstract.emp.Teacher;
import demo_abstract.stu.Student;

import java.text.SimpleDateFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Student s1;
        Teacher t1;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        s1 = new Student("Lam Viet Dat",sdf.parse("02/03/2004"),"1",7.5);
        t1 = new Teacher("Lam Viet Dat",sdf.parse("02/03/2004"),20101,2000,20000,1);

        System.out.println(t1.toString());
        System.out.println(s1.toString());
    }
}