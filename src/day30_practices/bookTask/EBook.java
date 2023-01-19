package day30_practices.bookTask;

public class EBook extends Book{

    private String size;
    private int pages;

    public EBook(String title, String type, String author, int price, String size, int pages) {
        super(title, type, author, price);
        setSize(size);
        setPages(pages); ;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages <= 0){
            System.out.println("Page number can not be negative");
            System.exit(1);
        }
        this.pages = pages;
    }

    public void readBook(){
        System.out.println("The book: " + getTitle() + " is read");
    }

    public String toString() {
        return "EBook{" +
                "size='" + size + '\'' +
                ", pages=" + pages +
                '}';
    }
}
