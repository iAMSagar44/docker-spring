package dev.sagar.demo.dockerspring.service;

import dev.sagar.demo.dockerspring.model.Book;
import dev.sagar.demo.dockerspring.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> retrieveAllBooks() {
        return bookRepository.findAll();
    }
}
