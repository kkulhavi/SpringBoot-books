package hr.tsd.books.controller;

import hr.tsd.books.model.Book;
import hr.tsd.books.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class BookRestController {
    @Autowired
    BookRepo bookRepo;

    @GetMapping("")
    public List<Book> getBooks(){
        return bookRepo.findAll();
    }
    @PostMapping("")
    public String addBook(@RequestBody Book book){
        bookRepo.save(book);
        return "book saved";
    }
}
