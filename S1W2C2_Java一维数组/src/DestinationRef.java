import java.util.Random;
import java.util.Scanner;

/**
 * @Author: Tian
 */

public class DestinationRef {
    public static void main(String[] args) {
        String[] destinationArray = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < destinationArray.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个旅游目的地：");
            destinationArray[i] = sc.next();
        }
        System.out.println("以下地方供旅游参考：");
        for (String destination : destinationArray) {
            System.out.print(destination + "  ");
        }
        System.out.println();
        Random random = new Random();
        int randomInt = random.nextInt(destinationArray.length);
        String randomDestination = destinationArray[randomInt];
        System.out.println("随机生成的旅游目的地：" + randomDestination);
    }
}
