/**
 * @Author: Tian
 */

public class AreaDemo {
    public static void main(String[] args) {
        double r = 4.5;
        double x = 8;
        double y = 5;
        AreaDemo ad = new AreaDemo();
        System.out.println("圆的面积为:" + ad.getArea(r));
        System.out.println("长方形的面积为:" + ad.getArea(x, y));
    }

    public double getArea(double x, double y) {
        return x * y;
    }

    public double getArea(double r) {
        return r * r * Math.PI;
    }
}
