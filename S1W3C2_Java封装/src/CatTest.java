/**
 * @author Tian
 */
public class CatTest {
    public static void main(String[] args) {
        //对象实例化操作
        Cat one = new Cat();

        one.setName("凡凡");
        one.setAge(1);
        one.setWeight(80);
        one.setSpecies("中华田园猫");


        System.out.println("昵称：" + one.getName());
        System.out.println("年龄：" + one.getAge());
        System.out.println("体重：" + one.getWeight());
        System.out.println("品种：" + one.getSpecies());
        System.out.println("------------------------");
    }
}
