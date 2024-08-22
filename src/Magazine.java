import java.util.*;

class Magazine extends Media {
    private Date editionDate;
    private String editorial;
    private List<String> authors;

    public Magazine(int id, String title, Date editionDate, String editorial) {
        super(id, title);
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.authors = new ArrayList<>();
    }

    public void addAuthor(String author) {
        authors.add(author);
    }

    @Override
    public void view(int minutes) {
        this.viewed = true;
        this.timeViewed = minutes;
        System.out.println("Has leído la revista: " + title + " durante " + minutes + " minutos.");
    }
}