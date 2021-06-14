/**
 * @Author: Tian
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {34, 12, 53, 32, 56, 17};
        for (int i = intArray.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                int temp;
                if (intArray[j] > intArray[j + 1]) {
                    temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
        System.out.println("The result of the bubble sorted array is:");
        for (int i : intArray) {
            System.out.print(i + "  ");
        }
    }

}
