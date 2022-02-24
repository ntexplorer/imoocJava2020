/**
 * @author Tian
 */
public class Test {
    public static void main(String[] args) {
        User one = new User("Lucy", "123456");
        User two = new User("Mike", "123456");
        UserManager um = new UserManager();
        System.out.println(um.checkUser(one, two));
    }
}
