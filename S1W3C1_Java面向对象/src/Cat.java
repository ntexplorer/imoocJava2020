/**
 * 宠物猫类
 *
 * @author Tian
 */
public class Cat {
    /**
     * 成员属性：昵称、年龄、体重、品种
     */
    String name;
    int age;
    double weight;
    String species;

    /**
     * 方法：跑动、吃东西
     */
    public void run() {
        System.out.println("小猫会跑");
    }

    /**
     * @param name 方法的重载，带属性
     */
    public void run(String name) {
        System.out.println(name + "快跑");
    }

    public void eat() {
        System.out.println("小猫吃鱼");
    }
}
