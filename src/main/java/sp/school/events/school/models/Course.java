package sp.school.events.school.models;

public class Course {

  private final long id;
  private final String name;
  private final String details;
  private final Boolean achived;

  public Course(long id, String name, String details, Boolean achived) {
    this.id = id;
    this.name = name;
    this.details = details;
    this.achived = achived;
  }

  /**
   * @return the achived
   */
  public Boolean getAchived() {
    return achived;
  }

  /**
   * @return the details
   */
  public String getDetails() {
    return details;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the id
   */
  public long getId() {
    return id;
  }

}