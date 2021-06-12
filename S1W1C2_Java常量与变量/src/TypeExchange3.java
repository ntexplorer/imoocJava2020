/**
 * @author Tian Zhang
 */

public class TypeExchange3 {
    public static void main(String[] args) {
        int num = 67832;
        char c = (char) num;
        int n = 65;
        char c1 = (char) n;
        long L = 987654321L;
        int i = (int) L;
        float f = L;
        L = (long) f;
        System.out.println("c=" + c);
        System.out.println("c1=" + c1);
        System.out.println("i=" + i);
        System.out.println("f=" + f);
        System.out.println("L=" + L);
    }
}
