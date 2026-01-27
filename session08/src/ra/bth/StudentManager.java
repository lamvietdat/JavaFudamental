package ra.bth;

public class StudentManager {
    private Student[] students;
    private int size;
    private static final int MAX_SIZE = 100;

    public StudentManager() {
        // khởi tao mảng 100 sinh viên
        students = new Student[MAX_SIZE];
        Student s1 = new Student(1,"Nguyen Van A", "11/11/2006","anv@gmail.com","0989743654",true);
        students[0] = s1;
        size = 1;
    }

    public void showListStudent(){
        // kểm tra mảng ko có sinh viên
        if(size == 0){
            System.out.println("Chưa có sinh viên nào trong danh sách");
            return;
        }
        // in tiêu đề bảng
        System.out.printf("+%s+%s+%s+%s+%s+%s+\n", "-".repeat(6), "-".repeat(17),
                "-".repeat(12), "-".repeat(17), "-".repeat(12), "-".repeat(7));
        System.out.printf("| %-4s | %-15s | %-10s | %-15s | %-10s | %-5s |\n",
                "ID", "Tên Sinh Viên", "Ngày Sinh", "Email", "Số ĐT", "Sex");
        System.out.printf("+%s+%s+%s+%s+%s+%s+\n", "-".repeat(6), "-".repeat(17),
                "-".repeat(12), "-".repeat(17), "-".repeat(12), "-".repeat(7));
        // duyệt mảng
        for (int i = 0; i <size ; i++) {
            students[i].displayData();
        }
        System.out.printf("+%s+%s+%s+%s+%s+%s+\n", "-".repeat(6), "-".repeat(17),
                "-".repeat(12), "-".repeat(17), "-".repeat(12), "-".repeat(7));

    }
    public void addStudent(){

    }
    public void updateStudent(){
    }
    public void deleteStudent(){
    }
    public void removeStudent(){

    }
}
