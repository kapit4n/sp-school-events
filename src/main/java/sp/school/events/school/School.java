package sp.school.events.school;

public class School {

    private final long id;
    private final String name;

    public School(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}