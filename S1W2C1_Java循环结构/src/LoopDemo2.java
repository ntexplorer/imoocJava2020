/**
 * @Author: Tian
 */

public class LoopDemo2 {
    public static void main(String[] args) {
        int ge, shi, bai;
        for (int i = 200; i <= 300; i++) {
            bai = i / 100;
            shi = (i % 100) / 10;
            ge = i - bai * 100 - shi * 10;
            int sum = bai + shi + ge;
            int product = bai * shi * ge;
            if (product == 42 && sum == 12) {
                System.out.println(i);
            }
        }
    }
}
