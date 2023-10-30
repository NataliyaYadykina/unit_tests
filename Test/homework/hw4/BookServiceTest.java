package homework.hw4;

import homework.hw4.book.Book;
import homework.hw4.book.BookRepository;
import homework.hw4.book.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class BookServiceTest {

    /*
     * У вас есть класс BookService, который использует интерфейс BookRepository
     * для получения информации о книгах из базы данных.
     * Ваша задача - написать unit-тесты для BookService,
     * используя Mockito для создания мок-объекта BookRepository.
     */

    Book book;

    @BeforeEach
    void setUp(){
        book = new Book("3", "Title3", "Author3");
    }

    @Test
    void getTitleTest(){
        assertThat(book.getTitle()).isEqualTo("Title3");
    }

    @Test
    void setTitleTest(){
        book.setTitle("Title3_new");
        assertThat(book.getTitle()).isEqualTo("Title3_new");
    }

    @Test
    void setAuthorTest(){
        book.setAuthor("Author3_new");
        assertThat(book.getAuthor()).isEqualTo("Author3_new");
    }

    @Test
    void getAuthorTest(){
        assertThat(book.getAuthor()).isEqualTo("Author3");
    }

    @Test
    void findBookByIdTest(){

        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
        when(bookRepository.findById("0")).thenReturn(new Book("0", "Title0", "Author0"));

        Book result = bookService.findBookById("0");

        assertThat(result.getTitle()).isEqualTo("Title0");
        assertThat(result.getAuthor()).isEqualTo("Author0");
    }

    @Test
    void findAllBooksTest(){

        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
        when(bookRepository.findAll()).thenReturn(List.of(new Book("0", "Title0", "Author0")));

        List<Book> result = bookService.findAllBooks();

        assertThat(result.get(0).getTitle()).isEqualTo("Title0");
        assertThat(result.get(0).getAuthor()).isEqualTo("Author0");
        assertThat(result.size()).isEqualTo(1);
    }

}
