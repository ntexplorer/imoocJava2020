/**
 * @author Tian Zhang
 */

public class TypeExchange2 {
    public static void main(String[] args) {
        char c = (char) 65536;
        int n;
        n = c;
        //隐式类型转换
        c = (char) n;

//        整型浮点型类型转换
        int x = 100;
        long y = x;
        x = (int) y;
        float f = 100000238219301823L;
        System.out.println("f=" + f);
    }
}
