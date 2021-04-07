import java.util.Scanner;

/**
 * @author Tian Zhang
 */

public class ConditionDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + "是偶数！");
        } else {
            System.out.println(n + "是奇数！");
        }
    }
}
