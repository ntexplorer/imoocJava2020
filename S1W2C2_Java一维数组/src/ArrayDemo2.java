/**
 * @Author: Tian
 */

public class ArrayDemo2 {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd', 'A', 'B', 'A', 'z', 'A'};
        int count = 0;
        for (char ch : charArray) {
            if (ch == 'a' || ch == 'A') {
                count += 1;
            }
        }
        System.out.println("字符数组中字符'a'或'A'的个数为：" + count);
    }
}
