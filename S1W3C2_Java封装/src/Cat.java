/**
 * 宠物猫类
 *
 * @author Tian
 */
public class Cat {
    /**
     * 成员属性：昵称、年龄、体重、品种
     * 修改属性的可见性为private
     */
    private String name;
    private int age;
    private double weight;
    private String species;

    public Cat() {
        System.out.println("我是无参构造方法");
    }

    public Cat(String name) {
        //在构造方法中调用另一个构造方法，必须放在首行
        this();
        System.out.println("我是带参构造方法---" + name);
        this.name = name;
    }

    public Cat(String name, int age, double weight, String species) {
        this.setName(name);
        this.setAge(age);
        this.setWeight(weight);
        this.setSpecies(species);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    /**
     * 方法：跑动、吃东西
     */
    public void run() {
        this.eat();
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("输入信息有误，年龄必须大于0");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
