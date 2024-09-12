import java.util.List;

public class Publication extends Media {
    protected String editionDate;
    protected String editorial;
    protected List<String> authors;

    public Publication(int id, String title, String editionDate, String editorial, List<String> authors) {
        super(id, title);
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.authors = authors;
    }

    public String getEditionDate() {
        return editionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public List<String> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "Publication{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", editionDate='" + editionDate + '\'' +
                ", editorial='" + editorial + '\'' +
                ", authors=" + authors +
                '}';
    }
}
