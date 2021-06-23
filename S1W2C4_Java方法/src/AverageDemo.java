/**
 * @Author: Tian
 */

public class AverageDemo {
    public static void main(String[] args) {
        AverageDemo ad = new AverageDemo();
        float[] floatArr = {78.5f, 98.5f, 65.5f, 32.5f, 75.5f};
        System.out.println("数组的平均值为:" + ad.getAverage(floatArr));
    }

    public float getAverage(float[] floatArray) {
        float sum = 0;
        for (float n : floatArray) {
            sum += n;
        }
        return sum / floatArray.length;
    }
}
