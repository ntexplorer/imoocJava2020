/**
 * @author Tian
 */
public class CatTest2 {
    public static void main(String[] args) {
        Cat one = new Cat();
        one.run();
        Cat two = new Cat("Hello");
        System.out.println(two.name);
        Cat three = new Cat("花花", 11, 22.2, "英国短毛猫");
        three.run();
    }
}
