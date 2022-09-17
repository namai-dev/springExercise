package com.example.mycode.books;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table
public class Book {

    @Id
    @SequenceGenerator(
            name = "book_gen",
            sequenceName = "book_gen",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "book-gen",
            strategy = GenerationType.SEQUENCE
    )
    private Long  id;
    private String bookNumber;
    @ManyToMany
    private Collection<Book> bookCategory;
    private boolean isLended;

    public Book(String bookNumber, Collection<Book> bookCategory, boolean isLended) {
        this.bookNumber = bookNumber;
        this.bookCategory = bookCategory;
        this.isLended = isLended;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }


    public Collection<Book> getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(Collection<Book> bookCategory) {
        this.bookCategory = bookCategory;
    }

    public boolean isLended() {
        return isLended;
    }

    public void setLended(boolean lended) {
        isLended = lended;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return isLended == book.isLended && Objects.equals(id, book.id) && Objects.equals(bookNumber, book.bookNumber) && Objects.equals(bookCategory, book.bookCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookNumber, bookCategory, isLended);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookNumber='" + bookNumber + '\'' +
                ", bookCategory=" + bookCategory +
                ", isLended=" + isLended +
                '}';
    }
}
