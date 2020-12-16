package org.procamp;

import com.sun.istack.internal.NotNull;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "building")
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "building_seq")
    @SequenceGenerator(name = "building_seq", sequenceName = "building_inst_id_seq", allocationSize = 1)
    @Column(name = "inst_id")
    private long buildingId;

    @Column(name = "report_id", nullable = false)
    private Long reportId;

    @Column(name = "building_name")
    private String buildingName;

    @Column(name = "is_active")
    private boolean isActive;

    @ManyToOne
    @JoinColumn(name = "reportId")
    private Report report;

    @OneToMany(mappedBy = "building")
    private List<Activity> activityList;

    public Report getReport() {return report; }

    public void setReport(Report report) {this.report = report; }

    public List<Activity> getActivityList() {return activityList; }

    public void setActivityList(List<Activity> activityList) {this.activityList = activityList; }

    public long getBuildingId() {return buildingId; }

    public void setBuildingId(long buildingId) {this.buildingId = buildingId; }

    public Long getReportId() {
        return reportId;
    }

    public void setReportId(Long reportId) {
        this.reportId = reportId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
