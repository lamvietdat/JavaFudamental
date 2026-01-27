package BaiKha2;

public class main {
    public static void main(String[] args) {
        Book sach = new Book("hao", "chuyên cươi",293);
        System.out.printf("Title :<%s>  author :<%s> price<%s>", sach.getTitle(), sach.getAuthor(), sach.getPrice());
    }
}
