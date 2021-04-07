/**
 * @author Tian Zhang
 */

public class IfDemo {
    public static void main(String[] args) {
        int x = -2, y = 0;
        if (x > 0) {
            y = 2 * x + 1;
        } else {
            y = x + 5;
        }
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
