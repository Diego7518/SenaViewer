public abstract class Media {
    protected int id;
    protected String title;
    protected boolean viewed;

    public Media(int id, String title) {
        this.id = id;
        this.title = title;
        this.viewed = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    public abstract String toString();
}

