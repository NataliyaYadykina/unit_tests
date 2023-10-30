package seminars.sem4.weather;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class WeatherReporterTest {

    /*
     * Предположим, у вас есть класс WeatherService, который имеет метод getCurrentTemperature(),
     * обращающийся к внешнему API для получения информации о текущей температуре.
     * Вам нужно протестировать другой класс, WeatherReporter, который использует WeatherService.
     * Создайте мок-объект для WeatherService с использованием Mockito.
     */

    @Test
    void weatherTest () {

        WeatherService weatherService = mock(WeatherService.class);
        WeatherReporter weatherReporter = new WeatherReporter(weatherService);
        when(weatherService.getCurrentTemperature()).thenReturn(25);

        String report = weatherReporter.generateReport();

        verify(weatherService, times(1)).getCurrentTemperature();
        assertThat(report).isEqualTo("Текущая температура: 25 градусов.");

    }

}
