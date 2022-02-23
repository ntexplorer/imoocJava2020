/**
 * @author Tian
 */
public class Monkey {
    String name, feature;

    public Monkey() {
        System.out.println("我是使用无参构造产生的猴子：");
        this.name = "长尾猴";
        this.feature = "尾巴长";
    }

    public Monkey(String name, String feature) {
        System.out.println("我是使用带参构造产生的猴子：");
        this.name = name;
        this.feature = feature;
    }
}
