class Chapter extends Media {
    private int duration;
    private int year;
    private int sessionNumber;

    public Chapter(int id, String title, int duration, int year, int sessionNumber) {
        super(id, title);
        this.duration = duration;
        this.year = year;
        this.sessionNumber = sessionNumber;
    }

    @Override
    public void view(int minutes) {
        this.viewed = true;
        this.timeViewed = minutes;
        System.out.println("Has visto el capítulo: " + title + " durante " + minutes + " minutos.");
    }

    public int getDuration() {
        return duration;
    }
}
