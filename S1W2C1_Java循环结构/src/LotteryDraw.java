import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * @Author: Tian
 */

public class LotteryDraw {
    public static void main(String[] args) throws IOException {
        int i = 0;
        while (i < 3) {
            enterPause();
            Random random = new Random();
            int n = random.nextInt(4);
            switch (n) {
                case 1: {
                    System.out.println("恭喜您抽中一等奖---键盘一台");
                    break;
                }
                case 2: {
                    System.out.println("恭喜您抽中二等奖---鼠标一个");
                    break;
                }
                case 3: {
                    System.out.println("恭喜您抽中三等奖---纪念品一枚");
                    break;
                }
                default: {
                    System.out.println("很遗憾，下次再来吧");
                    break;
                }
            }
            i++;
        }
        System.out.println("抽奖结束！");
    }

    public static void enterPause() throws IOException {
        System.out.println("按回车继续");
        new BufferedReader(new InputStreamReader(System.in)).readLine();
    }
}
