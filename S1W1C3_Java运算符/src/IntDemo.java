import java.util.Scanner;

/**
 * @Author: Tian
 */

public class IntDemo {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if ((n % 5 == 0) && (n % 7 == 0)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
