/**
 * @Author: Tian
 */

public class LoopDemo {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        while (n <= 5) {
            sum += n * n;
            n++;
        }
        System.out.println("1到5的平方和为：" + sum);
    }
}
