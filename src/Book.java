import java.util.List;

public class Book extends Publication {
    private String isbn;
    private boolean readed;
    private int timeReaded;

    public Book(int id, String title, String editionDate, String editorial, List<String> authors, String isbn) {
        super(id, title, editionDate, editorial, authors);
        this.isbn = isbn;
        this.readed = false;
        this.timeReaded = 0;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", editionDate='" + editionDate + '\'' +
                ", editorial='" + editorial + '\'' +
                ", authors=" + authors +
                ", isbn='" + isbn + '\'' +
                ", readed=" + readed +
                ", timeReaded=" + timeReaded +
                '}';
    }
}