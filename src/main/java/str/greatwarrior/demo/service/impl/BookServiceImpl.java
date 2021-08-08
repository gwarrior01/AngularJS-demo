package str.greatwarrior.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import str.greatwarrior.demo.model.Book;
import str.greatwarrior.demo.repository.BookRepository;
import str.greatwarrior.demo.service.BookService;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
