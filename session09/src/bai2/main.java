package bai2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookManager bhg = new BookManager();
        bhg.addBook(sc);
        bhg.printBooks();
    }


}
