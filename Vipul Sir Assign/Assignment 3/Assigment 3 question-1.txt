import java.util.Arrays;
import java.util.Scanner;

public class Book {

    String title;
    String[] authors = new String[10];
    int page_no;
    double price;
    String publisher;

    void add(String title, String authors, int page_no, double price, String publisher) {
        this.title = title;
        this.authors[0] = authors;
        this.page_no = page_no;
        this.publisher = publisher;
        this.price = price;

    }

    void delete() {
        this.price = 0;
        this.authors[0] = " ";
        this.title = " ";
        this.publisher = " ";
        this.price = 0.0;

    }

}
class Library
{

    public static void main(String[] args) {

        String[] Book = new String[5];
        Book my_life = new Book();
        Book your_life = new Book();
        Book everyone_life = new Book();
        Book someone_life = new Book();
        Book rock = new Book();
        my_life.add("ace ", "pathania", 123, 1000, "popatlal");
        Book[0] = my_life.title;
        your_life.add("pro ", "pats", 345, 1234, "jethatlal");
        Book[1] = your_life.title;
        my_life.delete();
        Book[0] = "null";
        everyone_life.add("yo ", "sd", 345, 124, "lal");
        Book[2] = your_life.title;
        someone_life.add("pika ", "pat", 335, 1242, "jetha");
        Book[3] = your_life.title;
        rock.add("zz ", "xcc", 23, 435, "jelal");
        Book[4] = your_life.title;



        double total_price = (my_life.price + your_life.price+ everyone_life.price+ someone_life.price+ rock.price);
        System.out.println("the total price is :" + total_price);
        System.out.println("books currently present in the library are as follows : ");
        for(int i =0;i<Book.length;i++)
        {
            System.out.println(i+" "+Book[i]);
        }


    }


}












