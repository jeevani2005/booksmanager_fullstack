package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	 @Autowired
	    private BookRepository bookRepository;

	    @Override
	    public Book addBook(Book book) {
	        return bookRepository.save(book);
	    }

	    @Override
	    public List<Book> getAllBook() {
	        return bookRepository.findAll();
	    }

	    @Override
	    public Book getBookById(int id) {
	        Optional<Book> opt = bookRepository.findById(id);
	        return opt.orElse(null);
	    }

	    @Override
	    public Book updateBook(Book book) {
	        return bookRepository.save(book);
	    }

	    @Override
	    public void deleteBookById(int id) {
	        bookRepository.deleteById(id);
	    }

		
}


   

