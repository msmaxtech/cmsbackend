package org.psmax.cmsbackend.Entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "client_master", schema = "psmax_cms", catalog = "")
public class ClientMaster {
    private Long clientId;
    private String city;
    private String clientName;
    private String copyRightsYear;
    private String country;
    private String createdBy;
    private Timestamp createdOn;
    private String emailId;
    private String facebookLink;
    private String lastModifiedBy;
    private Timestamp lastModifiedOn;
    private String phoneNo;
    private String street;
    private String twitterLink;
    private String websiteName;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "client_id", nullable = false)
    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "city", nullable = true, length = 45)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "client_name", nullable = true, length = 45)
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Basic
    @Column(name = "copy_rights_year", nullable = true, length = 45)
    public String getCopyRightsYear() {
        return copyRightsYear;
    }

    public void setCopyRightsYear(String copyRightsYear) {
        this.copyRightsYear = copyRightsYear;
    }

    @Basic
    @Column(name = "country", nullable = true, length = 45)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
    @Column(name = "email_id", nullable = true, length = 45)
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Basic
    @Column(name = "facebook_link", nullable = true, length = 45)
    public String getFacebookLink() {
        return facebookLink;
    }

    public void setFacebookLink(String facebookLink) {
        this.facebookLink = facebookLink;
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

    @Basic
    @Column(name = "phone_no", nullable = true, length = 45)
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Basic
    @Column(name = "street", nullable = true, length = 45)
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "twitter_link", nullable = true, length = 45)
    public String getTwitterLink() {
        return twitterLink;
    }

    public void setTwitterLink(String twitterLink) {
        this.twitterLink = twitterLink;
    }

    @Basic
    @Column(name = "website_name", nullable = true, length = 45)
    public String getWebsiteName() {
        return websiteName;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientMaster that = (ClientMaster) o;
        return clientId == that.clientId &&
                Objects.equals(city, that.city) &&
                Objects.equals(clientName, that.clientName) &&
                Objects.equals(copyRightsYear, that.copyRightsYear) &&
                Objects.equals(country, that.country) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(createdOn, that.createdOn) &&
                Objects.equals(emailId, that.emailId) &&
                Objects.equals(facebookLink, that.facebookLink) &&
                Objects.equals(lastModifiedBy, that.lastModifiedBy) &&
                Objects.equals(lastModifiedOn, that.lastModifiedOn) &&
                Objects.equals(phoneNo, that.phoneNo) &&
                Objects.equals(street, that.street) &&
                Objects.equals(twitterLink, that.twitterLink) &&
                Objects.equals(websiteName, that.websiteName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, city, clientName, copyRightsYear, country, createdBy, createdOn, emailId, facebookLink, lastModifiedBy, lastModifiedOn, phoneNo, street, twitterLink, websiteName);
    }
}
