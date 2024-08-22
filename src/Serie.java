import java.util.*;

class Series extends Media {
    private String genre;
    private String creator;
    private int duration;
    private int year;
    private int sessionQuantity;
    private List<Chapter> chapters;

    public Series(int id, String title, String genre, String creator, int duration, int year, int sessionQuantity) {
        super(id, title);
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
        this.year = year;
        this.sessionQuantity = sessionQuantity;
        this.chapters = new ArrayList<>();
    }

    public void addChapter(Chapter chapter) {
        chapters.add(chapter);
    }

    @Override
    public void view(int minutes) {
        this.viewed = true;
        this.timeViewed += minutes;
        System.out.println("Has visto la serie: " + title + " durante " + minutes + " minutos.");
    }
}