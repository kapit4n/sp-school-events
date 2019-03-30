package sp.school.events.school.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "school-years")
@EntityListeners(AuditingEntityListener.class)
public class SchoolYear {

    private long id;
    private String year;
    private Date startDate;
    private Date endDate;
    private Boolean isCurrent;
    private Boolean isAchived;

    public SchoolYear(long id, String year, Date startDate, Date endDate, Boolean isCurrent, Boolean isAchived) {
        this.setId(id);
        this.setYear(year);
        this.setStartDate(startDate);
        this.setEndDate(endDate);
        this.setIsCurrent(isCurrent);
        this.setIsAchived(isAchived);
    }

    /**
     * @return the isAchived
     */
    @Column(name = "isAchived", nullable = false)
    public Boolean getIsAchived() {
        return isAchived;
    }
    
    /**
     * @param isAchived the isAchived to set
     */
    public void setIsAchived(Boolean isAchived) {
        this.isAchived = isAchived;
    }
    
    /**
     * @return the isCurrent
     */
    @Column(name = "isCurrent", nullable = false)
    public Boolean getIsCurrent() {
        return isCurrent;
    }
    
    /**
     * @param isCurrent the isCurrent to set
     */
    public void setIsCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
    }
    
    /**
     * @return the endDate
     */
    @Column(name = "endDate", nullable = false)
    public Date getEndDate() {
        return endDate;
    }
    
    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    /**
     * @return the startDate
     */
    @Column(name = "startDate", nullable = false)
    public Date getStartDate() {
        return startDate;
    }
    
    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    /**
     * @return the year
     */
    @Column(name = "year", nullable = false)
    public String getYear() {
        return year;
    }
    
    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }
    
    /**
     * @return the id
     */
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }
}