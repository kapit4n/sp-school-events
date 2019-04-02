package sp.school.events.school.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Data
@Entity
@Table(name = "years")
@EntityListeners(AuditingEntityListener.class)
public class SchoolYear {

    private @Id @GeneratedValue long id;
    private String year;
    private Date startDate;
    private Date endDate;
    private Boolean isCurrent;
    private Boolean isAchived;

    public SchoolYear(String year, Date startDate, Date endDate, Boolean isCurrent, Boolean isAchived) {
        this.year = year;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isCurrent = isCurrent;
        this.isAchived = isAchived;
    }

    public SchoolYear() {}
}