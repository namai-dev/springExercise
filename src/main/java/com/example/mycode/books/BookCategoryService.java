package com.example.mycode.books;

import javax.annotation.PostConstruct;

public class BookCategoryService  {

    public final  BookCategoryRepo bookCategoryRepo;
    public final  Book book;

    public BookCategoryService(BookCategoryRepo bookCategoryRepo, Book book) {
        this.bookCategoryRepo = bookCategoryRepo;
        this.book = book;
    }



}
