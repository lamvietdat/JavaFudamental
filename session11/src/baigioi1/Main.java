package baigioi1;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new FullTimeEmployee(101, "Nguyễn Văn A", 15000000),
                new PartTimeEmployee(201, "Trần Thị B", 50000, 80),
                new FullTimeEmployee(102, "Lê Văn C", 20000000)
        };

        System.out.println("=== BẢNG LƯƠNG NHÂN VIÊN ===");

        for (Employee emp : employees) {
            emp.showInfo();
            double salary = emp.calculateSalary();
            System.out.println("Lương chính: " + String.format("%,.0f", salary) + " VNĐ");

            // Kiểm tra nếu nhân viên đủ điều kiện nhận thưởng
            if (emp instanceof BonusEligible) {
                double bonus = ((BonusEligible) emp).calculateBonus();
                System.out.println("Tiền thưởng: " + String.format("%,.0f", bonus) + " VNĐ");
                System.out.println("Tổng thu nhập: " + String.format("%,.0f", (salary + bonus)) + " VNĐ");
            } else {
                System.out.println("Đối tượng này không có thưởng.");
            }
            System.out.println("-----------------------------");
        }
    }
}
