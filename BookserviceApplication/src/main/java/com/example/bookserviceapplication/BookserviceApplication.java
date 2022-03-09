package com.example.bookserviceapplication;

import com.example.bookserviceapplication.dao.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
public class BookserviceApplication {

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/findAllBooks")
    public List<Book> getBooks(){

  return Stream.of(new Book(1,"abc",100),new Book(2,"xyz",300)).collect(Collectors.toList());
    }

    public static void main(String[] args) throws Exception

    {
        SpringApplication.run(BookserviceApplication.class, args);
    }

}
