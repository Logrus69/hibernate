package org.procamp;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="user_table", schema = "public")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_table_seq")
    @SequenceGenerator(name = "user_table_seq", sequenceName = "user_table_inst_id_seq", allocationSize = 1)
    @Column(name = "inst_id" )
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "last_name")
    private String lastName;
    @NotNull
    private String email;

    @Column(name = "email_backup")
    private String emailBackup;
    @NotNull
    private String tn;

    @Column(name = "tn_backup")
    private String tnBackup;

    @OneToMany(mappedBy = "user")
    private List<Report> reportList;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {this.userId = userId; }

    public List<Report> getReportList() {
        return reportList;
    }

    public void setReportList(List<Report> reportList) {
        this.reportList = reportList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailBackup() {
        return emailBackup;
    }

    public void setEmailBackup(String emailBackup) {
        this.emailBackup = emailBackup;
    }

    public String getTn() {
        return tn;
    }

    public void setTn(String tn) {
        this.tn = tn;
    }

    public String getTnBackup() {
        return tnBackup;
    }

    public void setTnBackup(String tnBackup) {
        this.tnBackup = tnBackup;
    }
}
