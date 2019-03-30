package sp.school.events.school.models;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "courses")
@EntityListeners(AuditingEntityListener.class)
public class Course {

  
  private long id;
  private String name;
  private String details;
  private Boolean achived;

  public Course(long id, String name, String details, Boolean achived) {
    this.id = id;
    this.name = name;
    this.details = details;
    this.achived = achived;
  }

  /**
   * @return the achived
   */
  @Column(name = "achived", nullable = false)
  public Boolean getAchived() {
    return achived;
  }
  /**
   * @param achived the achived to set
   */
  public void setAchived(Boolean achived) {
    this.achived = achived;
  }

  /**
   * @return the details
   */
  @Column(name = "details", nullable = false)
  public String getDetails() {
    return details;
  }
  /**
   * @param details the details to set
   */
  public void setDetails(String details) {
    this.details = details;
  }

  /**
   * @return the name
   */
  @Column(name = "name", nullable = false)
  public String getName() {
    return name;
  }
  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the id
   */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public long getId() {
    return id;
  }
	public void setId(Long id) {
		this.id = id;
	}
}