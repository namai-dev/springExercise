package com.example.mycode;



import com.example.mycode.admin.Admin;
import com.example.mycode.admin.AdminRepository;
import com.example.mycode.books.Book;
import com.example.mycode.books.BookCategory;
import com.example.mycode.books.BookCategoryRepo;
import com.example.mycode.books.BookRepository;
import com.example.mycode.student.Student;
import com.example.mycode.student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collection;

@SpringBootApplication

public class MycodeApplication {

	public static void main(String[] args) {

		SpringApplication.run(MycodeApplication.class, args);


	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository){
		Student s = new Student("Harmony", "Namai","Scm211-0363/2020","namaiharmony@gmail.com","Second Year");
		Student st = new Student("Jame", "Valverd","Scm211-0364/2020", "valavardeJame@gmail.com","Second Year");
		Student stt = new Student("Peter"," Okwemba","Scm211-0365/2020","okwembaPeter@gmail.com","First Year");

		return args -> {
			studentRepository.save(s);
			studentRepository.save(st);
			studentRepository.save(stt);

		};

	}

	@Bean
	CommandLineRunner commandLineRunner1(AdminRepository adminRepository){
		Admin d1 = new Admin("namaiharmony@gmail.com","password123");
		Admin d2 = new Admin("jumamustafa@gmail.com","startrek");
		Admin d3 = new Admin("georgemuseveni@gmail.com","python200");
		Admin d4= new Admin("wamerumburu@gmail.com","kingnamai");

		return args ->
		{
			adminRepository.save(d1);
			adminRepository.save(d2);
			adminRepository.save(d3);
			adminRepository.save(d4);

		};

	}

	@Bean
	CommandLineRunner commandLineRunner3(BookRepository bookRepository,BookCategoryRepo repo){
		Book b1 = new Book("Hsb-1819/2020", (Collection<Book>) new BookCategory("Computing"),false);

		return  args -> {
			bookRepository.save(b1);


		};
	}






}
