package com.example.mycode.books;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    public final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBooks(Book book){
        bookRepository.save(book);
    }

    public List<Book> showBook(){
        return bookRepository.findAll();
    }

}
