package homework.hw3;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    @Test
    void checkOddNumberTest(){
        boolean result = service.evenOddNumber(3);
        assertFalse(result);
    }


    // HW 3.2. Нужно написать метод numberInInterval, который проверяет,
    // попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%
    @ParameterizedTest
    @ValueSource(ints ={-1,0,25,100,150})
    void checkNumberInIntervalNegativeTest(int num) {
        boolean result = service.numberInInterval(num);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(ints ={30,50,99})
    void checkNumberInIntervalPositiveTest(int num) {
        boolean result = service.numberInInterval(num);
        assertTrue(result);
    }

}
