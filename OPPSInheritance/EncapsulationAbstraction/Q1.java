import java.util.Scanner;

import javax.sound.midi.SysexMessage;

class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    String getAuthorName() {
        return name;
    }

    String getAuthoremail() {
        return email;
    }

    char getAuthorgender() {
        return gender;
    }

}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    Book(String name, String authorName, String authorEmail, char authorGender, double price, int qtyInStock) {
        this.name = name;
        this.author = new Author(authorName, authorEmail, authorGender);
        this.price = price;
        this.qtyInStock = qtyInStock;
        // uthor a =new Author(name, email, gender)
    }

    public void displayBookData() {
        System.out.println("Name: " + name);
        System.out.println("Author Name: " + author.getAuthorName());
        System.out.println("Author Email: " + author.getAuthoremail());
        System.out.println("Author Gender: " + author.getAuthorgender());
        System.out.println("Book Price: " + price);
        System.out.println("Quantiy: " + qtyInStock);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        double price = s.nextDouble();
        s.nextLine();
        int qtyInStock = Integer.parseInt(s.nextLine());
        String aName = s.nextLine();
        String aEmail = s.nextLine();
        char aGender = s.nextLine().toCharArray()[0];

        Book book1 = new Book(name, aName, aEmail, aGender, price, qtyInStock);
        book1.displayBookData();

    }
}