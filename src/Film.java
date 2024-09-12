public class Film extends Media {
    protected String genre;
    protected String creator;
    protected int duration;
    protected int year;
    protected int timeViewed;

    public Film(int id, String title, String genre, String creator, int duration, int year) {
        super(id, title);
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
        this.year = year;
        this.timeViewed = 0;
    }

    public String getGenre() {
        return genre;
    }

    public String getCreator() {
        return creator;
    }

    public int getDuration() {
        return duration;
    }

    public int getYear() {
        return year;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", creator='" + creator + '\'' +
                ", duration=" + duration +
                ", year=" + year +
                ", viewed=" + viewed +
                ", timeViewed=" + timeViewed +
                '}';
    }
}
