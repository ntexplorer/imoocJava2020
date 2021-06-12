/**
 * @Author: Tian
 */


public class StarDemo {
    public static void main(String[] args) {
        int m = 4;
        int n = 3;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= m; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
            m -= 1;
            n += 2;
        }
    }
}
