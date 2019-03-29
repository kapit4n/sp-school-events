package sp.school.events.school.models;

public class SchoolYear {

    private final long id;
    private final int year;

    public SchoolYear(long id, int year) {
        this.id = id;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public int getyear() {
        return year;
    }
}