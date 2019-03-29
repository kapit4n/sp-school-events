package sp.school.events.school.models;

import java.util.Date;

public class SchoolYear {

    private final long id;
    private final String year;
    private final Date startDate;
    private final Date endDate;
    private final Boolean isCurrent;
    private final Boolean isAchived;

    public SchoolYear(long id, String year, Date startDate, Date endDate, Boolean isCurrent, Boolean isAchived) {
        this.id = id;
        this.year = year;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isCurrent = isCurrent;
        this.isAchived = isAchived;
    }

    /**
     * @return the isAchived
     */
    public Boolean getIsAchived() {
        return isAchived;
    }

    /**
     * @return the isCurrent
     */
    public Boolean getIsCurrent() {
        return isCurrent;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    public long getId() {
        return id;
    }

    public String getyear() {
        return year;
    }
}