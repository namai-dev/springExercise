package com.example.mycode.books;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookCategoryRepo extends JpaRepository<BookCategory,Long> {
}
