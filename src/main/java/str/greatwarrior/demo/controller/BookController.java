package str.greatwarrior.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import str.greatwarrior.demo.model.Book;
import str.greatwarrior.demo.service.BookService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping()
    public List<Book> getAll() {
        return bookService.findAll();
    }
}
