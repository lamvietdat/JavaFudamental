package bai4;

public class Book {
    private String Title;
    private String Author;
    private double Price ;

    public Book(String title, double price, String author) {
        Title = title;
        Price = price;
        Author = author;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }


    public void printInfo(){
        System.out.println("Title: " + Title);
        System.out.println("Author: " + Author);
        System.out.println("Price: " + Price);
    }
}
