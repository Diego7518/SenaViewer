class Movie extends Media {
    private String genre;
    private String creator;
    private int duration;
    private int year;

    public Movie(int id, String title, String genre, String creator, int duration, int year) {
        super(id, title);
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
        this.year = year;
    }

    @Override
    public void view(int minutes) {
        this.viewed = true;
        this.timeViewed = minutes;
        System.out.println("Has visto la película: " + title + " durante " + minutes + " minutos.");
    }

    public int getDuration() {
        return duration;
    }
}