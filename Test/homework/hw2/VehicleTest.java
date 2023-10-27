package homework.hw2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VehicleTest {

    // Arrange (Подготовка)
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car = new Car("Dodge", "Ram", 2010);
        motorcycle = new Motorcycle("Bike", "Motor", 2019);
    }

    /*
     * Проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
     */
    @Test
    public void testCarIsInstanceOfVehicle() {
        // Assert (Проверка утверждения)
        assertTrue(car instanceof Vehicle);
    }

    /*
     * Проверка того, объект Car создается с 4-мя колесами
     */
    @Test
    public void testCarHasFourWheels() {
        // Assert (Проверка утверждения)
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    /*
     * Проверка того, объект Motorcycle создается с 2-мя колесами
     */
    @Test
    public void testMotorcycleHasFourWheels() {
        // Assert (Проверка утверждения)
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    /*
     * Проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
     */
    @Test
    public void testCarSpeedTestDrive() {
        // Act (Выполнение)
        car.testDrive();

        // Assert (Проверка утверждения)
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    /*
     * Проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
     */
    @Test
    public void testMotorcycleSpeedTestDrive() {
        // Act (Выполнение)
        motorcycle.testDrive();

        // Assert (Проверка утверждения)
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    /*
     * Проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
     */
    @Test
    public void testCarSpeedPark() {
        // Act (Выполнение)
        car.testDrive();
        car.park();

        // Assert (Проверка утверждения)
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    /*
     * Проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
     */
    @Test
    public void testMotorcycleSpeedPark() {
        // Act (Выполнение)
        motorcycle.testDrive();
        motorcycle.park();

        // Assert (Проверка утверждения)
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

}
