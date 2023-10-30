package seminars.sem4.hotel;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class BookingServiceTest {

    /*
     * Вам необходимо написать тест с использованием моков для сервиса бронирования отелей.
     * Условие: У вас есть класс HotelService с методом public boolean isRoomAvailable(int roomId),
     * который обычно проверяет, доступен ли номер в отеле.
     * Вам необходимо проверить правильность работы класса BookingService, который
     * использует HotelService для бронирования номера, если он доступен.
     */

    @Test
    void bookingTestPositive() {
        HotelService hotelService = mock(HotelService.class);
        BookingService bookingService = new BookingService(hotelService);
        when(hotelService.isRoomAvailable(2)).thenReturn(true);

        boolean check = bookingService.bookRoom(2);

        verify(hotelService, times(1)).isRoomAvailable(2);
        assertThat(check).isEqualTo(true);
    }

    @Test
    void bookingTestNegative() {
        HotelService hotelService = mock(HotelService.class);
        BookingService bookingService = new BookingService(hotelService);
        when(hotelService.isRoomAvailable(1)).thenReturn(false);

        boolean check = bookingService.bookRoom(1);

        verify(hotelService, times(1)).isRoomAvailable(1);
        assertThat(check).isEqualTo(false);
    }

}
