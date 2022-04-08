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
        //localhost:8081/book?id=2
    //public Book getBook(@RequestParam(defaultValue = "1") int id)
    @GetMapping("/book")
    public Book getBook(@RequestParam int id){
        return bookRepo.findById(id).orElse(null);
    }
    @PostMapping("")
    public String addBook(@RequestBody Book book){
        bookRepo.save(book);
        return "book saved";
    }
}
