package seminars.sem4.database;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class DataProcessorTest {

    /*
     * Вам требуется протестировать класс, который обрабатывает запросы к базе данных.
     * Условие: У вас есть класс Database с методом public List<String> query(String sql), который выполняет SQLзапрос и возвращает результат.
     * Вам необходимо проверить правильность работы класса DataProcessor, который использует Database для
     * выполнения запроса и обработки результатов.
     */

    @Test
    void dataProcessorTest(){
        Database database = mock(Database.class);
        DataProcessor dataProcessor = new DataProcessor(database);
        when(database.query(anyString()))
                .thenReturn(Arrays.asList(
                        "Str1", "Str2", "Str3"));

        List<String> result = database.query("Str");

        verify(database).query("Str");
        assertThat(result)
                .hasSize(3)
                .isEqualTo(Arrays.asList("Str1", "Str2", "Str3"));

    }

}
