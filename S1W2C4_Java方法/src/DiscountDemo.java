import java.util.Scanner;

/**
 * @Author: Tian
 */

public class DiscountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品总价：");
        double price = sc.nextDouble();
        DiscountDemo dd = new DiscountDemo();
        dd.calculateDiscount(price);
    }

    public void calculateDiscount(double price) {
        if (price < 100) {
            System.out.println("商品不打折，总价为：" + price);
        } else if (price < 199) {
            price *= 0.95;
            System.out.println("折后商品总价为：" + price);
        } else {
            price *= 0.85;
            System.out.println("折后商品总价为：" + price);
        }
    }
}
