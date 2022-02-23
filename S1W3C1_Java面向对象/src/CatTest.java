/**
 * @author Tian
 */
public class CatTest {
    public static void main(String[] args) {
        //对象实例化操作
        Cat one = new Cat();
//        Cat two = new Cat();
        //此时one和two指向同一个内存空间
        Cat two = one;
        one.eat();
        one.run();
        System.out.println();

        one.name = "凡凡";
        one.age = 1;
        one.weight = 80;
        one.species = "中华田园猫";
        two.name = "花花";
        two.age = 2;
        two.weight = 100;
        two.species = "英国短毛猫";

        System.out.println("昵称：" + one.name);
        System.out.println("年龄：" + one.age);
        System.out.println("体重：" + one.weight);
        System.out.println("品种：" + one.species);
        System.out.println("------------------------");
        System.out.println("昵称：" + two.name);
        System.out.println("年龄：" + two.age);
        System.out.println("体重：" + two.weight);
        System.out.println("品种：" + two.species);
    }
}
