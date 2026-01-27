package bai2;

import java.util.Scanner;

public class BookManager {
      private static Book[] books;
       private static  int MAX_SIZE =100;
       private static int size=0;

       static {
            books = new Book[MAX_SIZE];
         }

        public static void addBook(Scanner sc){
           for(int i=0;i<3;i++){
               Book book = new Book();
               book.inputdata(sc);
               books[size]=book;
               size++;
           }
        }

        public static void printBooks(){
           for (int i = 0; i < size; i++) {
            books[i].printdata();
               System.out.println();
           }
        }

}
