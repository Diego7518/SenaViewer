import java.util.*;

class Database {
    private List<Movie> movies;
    private List<Book> books;
    private List<Series> series;
    private List<Magazine> magazines;

    public Database() {
        movies = new ArrayList<>();
        books = new ArrayList<>();
        series = new ArrayList<>();
        magazines = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addSeries(Series series) {
        this.series.add(series);
    }

    public void addMagazine(Magazine magazine) {
        magazines.add(magazine);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Series> getSeries() {
        return series;
    }

    public List<Magazine> getMagazines() {
        return magazines;
    }
}