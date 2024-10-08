public class Chapter extends Media {
    private int duration;
    private int year;
    private int sessionNumber;
    private int timeViewed;

    public Chapter(int id, String title, int duration, int year, int sessionNumber) {
        super(id, title);
        this.duration = duration;
        this.year = year;
        this.sessionNumber = sessionNumber;
        this.timeViewed = 0;
    }

    public int getDuration() {
        return duration;
    }

    public int getYear() {
        return year;
    }

    public int getSessionNumber() {
        return sessionNumber;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", year=" + year +
                ", sessionNumber=" + sessionNumber +
                ", viewed=" + viewed +
                ", timeViewed=" + timeViewed +
                '}';
    }
}

