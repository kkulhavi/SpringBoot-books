package hr.tsd.books;

import hr.tsd.books.model.Book;
import hr.tsd.books.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BooksApplication implements CommandLineRunner {
    @Autowired
    BookRepo bookRepo;

    public static void main(String[] args) {
        SpringApplication.run(BooksApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Book java1=new Book("Goetz Brian","Java",150);
        Book java2=new Book("Bloch Joshua","Java",220);
        Book cpp=new Book("Meyers Scott","C++",160);
        Book js=new Book("Crockford Douglas","Java Script",130);
        Book mac=new Book("Meyers Scott","Mac OS",160);

        bookRepo.save(java1);
        bookRepo.save(java2);
        bookRepo.save(cpp);
        bookRepo.save(js);
        bookRepo.save(mac);
    }
}
