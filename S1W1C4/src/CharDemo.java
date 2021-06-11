import java.util.Scanner;

/**
 * @author Tian Zhang
 */

public class CharDemo {
    public static void main(String[] args) {
        System.out.println("请输入一个字母:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = str.charAt(0);
        switch (ch) {
            case ('a'): {
                System.out.println("元音字母a");
                break;
            }
            case ('e'): {
                System.out.println("元音字母e");
                break;
            }
            case ('i'): {
                System.out.println("元音字母i");
                break;
            }
            case ('o'): {
                System.out.println("元音字母o");
                break;
            }
            case ('u'): {
                System.out.println("元音字母u");
                break;
            }
            default: {
                System.out.println("不是元音字母");
            }
        }
    }
}
