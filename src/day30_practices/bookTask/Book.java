package day30_practices.bookTask;

public class Book {

    private String title, type, author;
    private int price;

    public Book(String title, String type, String author, int price) {
        setTitle(title);
        setType(type);
        setAuthor(author);
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {

        if (price <= 0){
            System.err.println("Price can not be 0 or negative number");
            System.exit(1);
        }
        this.price = price;
    }

    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
