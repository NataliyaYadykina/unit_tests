package seminars.sem4.message;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class NotificationServiceTest {

    /*
     * Вам нужно написать тест с использованием моков для сервиса отправки сообщений.
     * Условие: У вас есть класс MessageService с методом public void sendMessage(String message, String
     * recipient), который отправляет сообщение получателю.
     * Вам необходимо проверить правильность работы класса NotificationService, который использует
     * MessageService для отправки уведомлений.
     */

    @Test
    void messageServiceTest() {
        MessageService messageService = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageService);

        messageService.sendMessage("Hello", "Vasia");

        verify(messageService, times(1)).sendMessage("Hello", "Vasia");
    }

}
