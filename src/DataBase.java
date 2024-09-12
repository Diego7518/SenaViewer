import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Movie> movies;
    private List<Serie> series;
    private List<Book> books;
    private List<Magazine> magazines;

    public DataBase() {
        this.movies = new ArrayList<>();
        this.series = new ArrayList<>();
        this.books = new ArrayList<>();
        this.magazines = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addSerie(Serie serie) {
        series.add(serie);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMagazine(Magazine magazine) {
        magazines.add(magazine);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public List<Serie> getSeries() {
        return series;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Magazine> getMagazines() {
        return magazines;
    }
}

