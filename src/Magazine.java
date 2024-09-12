import java.util.List;

public class Magazine extends Publication {

    public Magazine(int id, String title, String editionDate, String editorial, List<String> authors) {
        super(id, title, editionDate, editorial, authors);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", editionDate='" + editionDate + '\'' +
                ", editorial='" + editorial + '\'' +
                ", authors=" + authors +
                '}';
    }
}
