package br.com.aincrad.books.service;


import br.com.aincrad.books.model.Book;
import br.com.aincrad.books.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookRepository bookRepository;
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book findById(Long id) {
        return bookRepository.findById(id).orElseThrow();
    }

    public void delete(Long id){
        bookRepository.deleteById(id);
    }

    public Book update(Long id, Book book){
        book.setId(id);
        book.setTitle(book.getTitle());
        book.setAuthor(book.getAuthor());
        book.setDescription(book.getDescription());
        return bookRepository.save(book);
    }



}
