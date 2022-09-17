package com.example.mycode.books;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "amo/api/book")
public class BookController {
    public  final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping(path = "/addBook")
    public String saveBook(@RequestBody Book book){
        bookService.addBooks(book);
        return "Book Saved";
    }

    @GetMapping(path = "/showBook")
    public List<Book> showBook(){

        return bookService.showBook();
    }

}
