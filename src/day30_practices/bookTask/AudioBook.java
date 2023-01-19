package day30_practices.bookTask;

public class AudioBook extends Book{

    private String narrator;
    private int length;


    public AudioBook(String title, String type, String author, int price, int length, String narrator) {
        super(title, type, author, price);
        setLength(length);
        setNarrator(narrator);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public String toString() {
        return "AudioBook{" +
                "narrator='" + narrator + '\'' +
                ", length=" + length +
                '}';
    }
}
