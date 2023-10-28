package homework.hw3;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SomeServiceTest {

    // HW 3.1. Нужно покрыть тестами метод evenOddNumber на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
    SomeServiceHW service;

    @BeforeEach
    void setUp(){
        service = new SomeServiceHW();
    }

    @Test
    void checkEvenNumberTest(){
        boolean result = service.evenOddNumber(2);
        assertTrue(result);
    }


    // HW 3.2. Нужно написать метод, который проверяет,
    // попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%

}
