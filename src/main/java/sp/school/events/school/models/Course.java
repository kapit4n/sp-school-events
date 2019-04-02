package sp.school.events.school.models;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@Entity
@Table(name = "courses")
@EntityListeners(AuditingEntityListener.class)
public class Course {
  
  private @Id @GeneratedValue long id;
  private String name;
  private String details;
  private Boolean achived;

  public Course(String name, String details, Boolean achived) {
    this.setName(name);
    this.setDetails(details);
    this.setAchived(achived);
  }

  public void setId(long id) {
    this.id = id;
  }

  /**
   * @return the achived
   */
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
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  public Course()
  {
    
  }
}