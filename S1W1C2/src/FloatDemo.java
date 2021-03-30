/**
 * @author Tian Zhang
 */
public class FloatDemo {
    public static void main(String[] args) {
//        定义单精度浮点型变量，存放1234.328
        float f = 1234.328f;
        System.out.println("f = " + f);
//        定义双精度浮点型变量，存放5623.465
        double d = 5623.465;
        System.out.println("d = " + d);
//        将整形赋值给浮点型
        double d1 = 123L;
        System.out.println("d1 = " + d1);

        double d2 = d;
        System.out.println("d2 = " + d2);
    }
}
