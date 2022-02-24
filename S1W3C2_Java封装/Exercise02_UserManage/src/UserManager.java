/**
 * @author Tian
 */
public class UserManager {
    public String checkUser(User one, User two) {
        String username1, username2, password1, password2;
        username1 = one.getUsername();
        username2 = two.getUsername();
        password1 = one.getPassword();
        password2 = two.getPassword();
        if (username1.equals(username2) && password1.equals(password2)) {
            return ("用户名和密码一致");
        } else {
            return ("用户名或密码不一致");
        }
    }
}
