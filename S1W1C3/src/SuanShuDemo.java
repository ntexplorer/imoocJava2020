/**
 * @author Tian Zhang
 */

public class SuanShuDemo {
    public static void main(String[] args) {
        int a = 4, b = 15, c = 20;
        int m = (b / a) + c;
        int n = (c % b) * a - c;
        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }
}
