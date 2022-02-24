/**
 * @author Tian
 */
public class Book {
    private final String bookName;
    private final String author;
    private String publisherName;
    private float price;

    public Book(String bookName, String author, String publisherName, float price) {
        this.bookName = bookName;
        this.author = author;
        this.setPrice(price);
        this.setPublisherName(publisherName);
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price < 10) {
            System.out.println("图书价格最低10元");
            this.price = 10;
        } else {
            this.price = price;
        }
    }

    public void showInfo() {
        System.out.println("书名：" + this.getBookName());
        System.out.println("作者：" + this.getAuthor());
        System.out.println("出版社：" + this.getPublisherName());
        System.out.println("价格：" + this.getPrice() + "元");
    }
}
