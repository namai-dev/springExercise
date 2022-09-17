package com.example.mycode.books;


import javax.persistence.*;
import java.util.Collection;

@Entity
@Table

public class BookCategory {

    @Id
    @SequenceGenerator(
            name = "bookCategory_gen",
            sequenceName = "bookCategory_gen",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "bookCategory_gen",
            strategy = GenerationType.SEQUENCE

    )
    private  Long id;
    private String category;

    @ManyToMany
    private Collection<Book> book;


    public BookCategory(String category) {
        this.category = category;
    }

    public BookCategory() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
