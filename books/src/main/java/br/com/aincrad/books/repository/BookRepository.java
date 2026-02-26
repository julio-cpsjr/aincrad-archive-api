package br.com.aincrad.books.repository;

import br.com.aincrad.books.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
