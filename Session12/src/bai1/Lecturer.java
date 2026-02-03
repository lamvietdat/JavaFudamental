package bai1;

public class Lecturer extends Staff implements ICapability {
    private int teachingHours;

    public Lecturer(String id, String name, double baseSalary, int teachingHours) {
        super(id, name, baseSalary);
        this.teachingHours = teachingHours;
    }

    @Override
    public double calculateTotalSalary() {
        return baseSalary + (teachingHours * 200000);
    }

    @Override
    public void checkPerformance() {
        System.out.println("Đánh giá giảng viên: Dựa trên số giờ dạy và phản hồi từ sinh viên.");
    }

    public void setTeachingHours(int teachingHours) { this.teachingHours = teachingHours; }
}