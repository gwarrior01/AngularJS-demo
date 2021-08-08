package str.greatwarrior.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import str.greatwarrior.demo.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
