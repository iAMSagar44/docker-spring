package dev.sagar.demo.dockerspring.repository;

import dev.sagar.demo.dockerspring.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
