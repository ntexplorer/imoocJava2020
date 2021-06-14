import java.util.Scanner;

/**
 * @Author: Tian
 */

public class ArrayDemo {
    public static void main(String[] args) {
//        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int[] intArray = new int[10];
        System.out.println("请输入数组元素：");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = sc.nextInt();
        }
        System.out.println("能被3整除的数组元素为：");
        for (int j : intArray) {
            if (j % 3 == 0) {
                System.out.println(j);
            }
        }
    }
}
