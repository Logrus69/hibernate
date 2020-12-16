package org.procamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "report", schema = "public")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "report_seq")
    @SequenceGenerator(name = "report_seq", sequenceName = "report_inst_id_seq", allocationSize = 1)
    @Column(name = "inst_id")
    private Long reportId;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "report_name")
    private String reportName;

    private Double price;

    @Column(name = "order_date", nullable = false)
    private Date orderDate;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @OneToMany(mappedBy = "report")
    private List<Building> buildingList;

    public User getUser() {return user; }

    public void setUser(User user) {this.user = user; }

    public List<Building> getBuildingList() {return buildingList; }

    public void setBuildingList(List<Building> buildingList) {
        this.buildingList = buildingList;
    }

    public Long getReportId() {return reportId; }

    public void setReportId(Long reportId) {this.reportId = reportId; }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
