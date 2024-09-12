import java.util.ArrayList;
import java.util.List;

public class Serie extends Film {
    private int sessionQuantity;
    private List<Chapter> chapters;

    public Serie(int id, String title, String genre, String creator, int duration, int year, int sessionQuantity) {
        super(id, title, genre, creator, duration, year);
        this.sessionQuantity = sessionQuantity;
        this.chapters = new ArrayList<>();
    }

    public void addChapter(Chapter chapter) {
        chapters.add(chapter);
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", creator='" + creator + '\'' +
                ", duration=" + duration +
                ", year=" + year +
                ", viewed=" + viewed +
                ", timeViewed=" + timeViewed +
                ", sessionQuantity=" + sessionQuantity +
                ", chapters=" + chapters.size() +
                '}';
    }
}