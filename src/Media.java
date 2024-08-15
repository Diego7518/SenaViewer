abstract class Media {
    protected int id;
    protected String title;
    protected boolean viewed;
    protected int timeViewed;

    public Media(int id, String title) {
        this.id = id;
        this.title = title;
        this.viewed = false;
        this.timeViewed = 0;
    }

    public abstract void view(int minutes);

    public String getTitle() {
        return title;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    public boolean isViewed() {
        return viewed;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }
}
