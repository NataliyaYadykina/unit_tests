package homework.hw3;


import org.junit.jupiter.api.BeforeEach;
import seminars.sem3.coverage.SomeService;

public class SomeServiceTest {

    // HW 3.1. Нужно покрыть тестами метод evenOddNumber на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
    SomeServiceHW service;

    @BeforeEach
    void setUp(){
        service = new SomeServiceHW();
    }

    // HW 3.2. Нужно написать метод, который проверяет,
    // попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%

}
