package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements IBookService{
    @Autowired
    private IBookRepository bookRepository;
    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBook(int id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public void update(Book book) {
        bookRepository.save(book);
    }
}
