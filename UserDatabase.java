import java.util.ArrayList;

public class UserDatabase {
    private ArrayList<User> users = new ArrayList<>();

    // add user to database
    public void addUser(User user) {
        users.add(user);
    }

    // check if user exists in database
    public boolean userExists(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    // validate user credentials
    public boolean validateUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
