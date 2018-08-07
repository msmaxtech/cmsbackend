package org.psmax.cmsbackend.Entity;

import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "user_master", schema = "psmax_cms", catalog = "")
public class UserMaster {
    private String userId;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String createdBy;
    private Timestamp createdOn;
    @LastModifiedDate
    private String lastModifiedBy;
    private Timestamp lastModifiedOn;

    @Id
    @Column(name = "user_id", nullable = false, length = 45)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name", nullable = true, length = 150)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "first_name", nullable = true, length = 70)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name", nullable = true, length = 70)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "created_by", nullable = true, length = 45)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "created_on", nullable = true)
    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    @Basic
    @Column(name = "last_modified_by", nullable = true, length = 45)
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @Basic
    @Column(name = "last_modified_on", nullable = true)
    public Timestamp getLastModifiedOn() {
        return lastModifiedOn;
    }

    public void setLastModifiedOn(Timestamp lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserMaster that = (UserMaster) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(password, that.password) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(createdOn, that.createdOn) &&
                Objects.equals(lastModifiedBy, that.lastModifiedBy) &&
                Objects.equals(lastModifiedOn, that.lastModifiedOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, password, firstName, lastName, createdBy, createdOn, lastModifiedBy, lastModifiedOn);
    }
}
