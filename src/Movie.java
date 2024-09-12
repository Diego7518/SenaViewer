public class Movie extends Film {

    public Movie(int id, String title, String genre, String creator, int duration, int year) {
        super(id, title, genre, creator, duration, year);
    }

    @Override
    public String toString() {
        return "Movie{" +
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
