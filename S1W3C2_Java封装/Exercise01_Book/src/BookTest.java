/**
 * @author Tian
 */
public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("红楼梦", "曹雪芹", "人民文学出版社", 5f);
        Book book2 = new Book("小李飞刀", "古龙", "中国长安出版社", 55.5f);
        book1.showInfo();
        System.out.println("=====================");
        book2.showInfo();
    }
}
