package seminars.sem3.tdd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    static UserRepository repository;

    /*
     * Добавьте класс UserRepository для управления пользователями. В этот класс должен быть включен метод
     * addUser, который добавляет пользователя в систему, если он прошел аутентификацию. Покройте тестами новую
     * функциональность
     */
    @BeforeAll
    static void setUp(){
        repository = new UserRepository();
    }

    @Test
    void checkAuthenticateUserPositive(){
        String name = "name";
        String password = "password";

        User user = new User(name, password, false);
        boolean accept = user.authenticate(name, password);
        assertTrue(accept);
    }

    @Test
    void checkAuthenticateUserNegative(){
        String name = "name";
        String password = "password";
        String wrongPassword = "wrongPassword";

        User user = new User(name, password, false);
        boolean accept = user.authenticate(name, wrongPassword);
        assertFalse(accept);
    }

    @Test
    void checkRepositoryAddAuthenticatedUserPositive(){
        String name = "name";
        String password = "password";

        User user = new User(name, password, false);
        user.authenticate(name, password);

        int currentCount = repository.data.size();
        repository.addUser(user);

        assertThat(repository.data.size())
                .isEqualTo(currentCount + 1);

        User userInRepository =
                repository.data.get(repository.data.size() - 1);

        assertEquals(user, userInRepository);
    }

    @Test
    void checkRepositoryAddNotAuthenticatedUserNegative(){
        String name = "name";
        String password = "password";

        User user = new User(name, password, false);

        int currentCount = repository.data.size();
        repository.addUser(user);

        assertThat(repository.data.size())
                .isEqualTo(currentCount);
    }

    @Test
    void checkLogoutUsersNotAdminsTest() {

        User user1 = new User("John", "password", false);
        user1.authenticate("John", "password");
        User user2 = new User("Fox", "password", false);
        user2.authenticate("Fox", "password");
        User user3 = new User("David", "password", true);
        user3.authenticate("David", "password");

        repository.addUser(user1);
        repository.addUser(user2);
        repository.addUser(user3);

        repository.logoutUsersNotAdmins();

        assertThat(repository.data.size()).isEqualTo(1);
        assertThat(repository.data.get(0).name).isEqualTo("David");

    }
}
