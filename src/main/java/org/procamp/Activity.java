package org.procamp;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "activity")
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "activity_seq")
    @SequenceGenerator(name = "activity_seq", sequenceName = "activity_inst_id_seq", allocationSize = 1)
    @Column(name = "inst_id")
    private Long activityId;

    @Column(name = "building_id", nullable = false)
    private Long buildingId;

    @Column(name = "work_name")
    private String workName;
    private String measurement;
    private Double price;
    private Double amount;

    @ManyToOne
    @JoinColumn(name = "buildingId")
    private Building building;

    @OneToMany(mappedBy = "activity")
    private List<Material> materialList;

    public Building getBuilding() {return building; }

    public void setBuilding(Building building) {this.building = building; }

    public List<Material> getMaterialList() {return materialList; }

    public void setMaterialList(List<Material> materialList) {this.materialList = materialList; }

    public Long getActivityId() {return activityId; }

    public void setActivityId(Long activityId) {this.activityId = activityId; }

    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
