package seminars.sem3.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        if(!user.isAuthenticate) return;
        data.add(user);
    }

    public void logoutUser(User user) {
        if(!user.isAuthenticate) return;
        data.remove(user);
    }

    public void logoutUsersNotAdmins() {
        for(int i = data.size() - 1; i >= 0; i--) {
            if (!data.get(i).isAdmin) {
                logoutUser(data.get(i));
            }
        }
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }
}
