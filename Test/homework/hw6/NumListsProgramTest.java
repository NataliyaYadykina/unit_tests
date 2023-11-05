package homework.hw6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NumListsProgramTest {

    NumbersList list1;
    NumbersList list2;
    NumListsProgram numListsProgram;

    @BeforeEach
    void setUp(){
        list1 = new NumbersList(Arrays.asList(2, 1, 0, 4, -15));
        list2 = new NumbersList(Arrays.asList(3, 2, 0, 3, -16, 2));
        numListsProgram = new NumListsProgram(list1, list2);
    }

    // Тестирование метода получения списка
    @Test
    void getNumListTest() {
        assertThat(list1.getNumList()).isNotNull();
        assertThat(list1.getNumList()).hasSize(5);
        assertThat(list1.getNumList().get(0)).isEqualTo(2);
    }

    // Тестирование позитивного сценария расчета среднего значения
    @Test
    void calculateNumListAveragePositive() {

        assertThat(numListsProgram.calculateNumListAverage(list1))
                .isEqualTo((double) (2 + 1 + 4 - 15) / 5);

    }

    // Тестирование негативного сценария расчета среднего значения - когда список пуст.
    @Test
    void calculateNumListAverageNegative() {

        list2 = new NumbersList(List.of());

        assertThatThrownBy(() -> numListsProgram.calculateNumListAverage(list2))
                .isInstanceOf(ArithmeticException.class);

    }

    // Тестирование метода сравнения двух средних - первое больше
    @Test
    void twoListAverageCompareFirstMoreTest() {

        double avg1 = 3;
        double avg2 = -1;

        assertThat(numListsProgram.twoListAverageCompare(avg1, avg2))
                .isEqualTo("Первый список имеет большее среднее значение");

    }

    // Тестирование метода сравнения двух средних - второе больше
    @Test
    void twoListAverageCompareFirstLessTest() {

        double avg1 = -3;
        double avg2 = 0;

        assertThat(numListsProgram.twoListAverageCompare(avg1, avg2))
                .isEqualTo("Второй список имеет большее среднее значение");

    }

    // Тестирование метода сравнения двух средних - они равны
    @Test
    void twoListAverageCompareEqualTest() {

        double avg1 = 2;
        double avg2 = 2;

        assertThat(numListsProgram.twoListAverageCompare(avg1, avg2))
                .isEqualTo("Средние значения равны");

    }

}
