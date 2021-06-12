/**
 * @author Tian Zhang
 */

public class CharDemo {
    public static void main(String[] args) {
//        定义变量存放字符'a'
        char a = 'a';
        System.out.println("a = " + a);
        char ch = 65;
        System.out.println("ch = " + ch);
        //强制类型转换
        char ch1 = (char) 65536;
//        定义变量存放unicode编码的字符
        char c = '\u005d';
        System.out.println("c=" + c);
    }
}
