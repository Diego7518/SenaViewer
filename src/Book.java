import java.util.*;

class Book extends Media {
    private Date editionDate;
    private String editorial;
    private String isbn;
    private List<String> authors;

    public Book(int id, String title, Date editionDate, String editorial, String isbn) {
        super(id, title);
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.isbn = isbn;
        this.authors = new ArrayList<>();
    }

    public void addAuthor(String author) {
        authors.add(author);
    }

    @Override
    public void view(int minutes) {
        this.viewed = true;
        this.timeViewed = minutes;
        System.out.println("Has leído el libro: " + title + " durante " + minutes + " minutos.");
    }
}