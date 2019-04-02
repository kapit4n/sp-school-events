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

  
  private  @Id @GeneratedValue long id;
  private String name;
  private String details;
  private Boolean achived;

  public Course(String name, String details, Boolean achived) {
    this.name = name;
    this.details = details;
    this.achived = achived;
  }

  public Course()
  {
    
  }
}