package org.psmax.cmsbackend.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Client {
    private int clientId;
    private String clientName;
    private String websiteName;
    private String street;
    private String city;
    private String country;
    private String phoneNo;
    private String emailId;
    private String copyRightsYear;
    private String facebookLink;
    private String twitterLink;
    private String createdBy;
    private Timestamp createdOn;
    private String lastModifiedBy;
    private Timestamp lastModifiedOn;

    @Id
    @Column(name = "CLIENT_ID", nullable = false)
    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "CLIENT_NAME", nullable = true, length = 45)
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Basic
    @Column(name = "WEBSITE_NAME", nullable = true, length = 45)
    public String getWebsiteName() {
        return websiteName;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }

    @Basic
    @Column(name = "STREET", nullable = true, length = 45)
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "CITY", nullable = true, length = 45)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "COUNTRY", nullable = true, length = 45)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "PHONE_NO", nullable = true, length = 45)
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Basic
    @Column(name = "EMAIL_ID", nullable = true, length = 45)
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Basic
    @Column(name = "COPY_RIGHTS_YEAR", nullable = true, length = 45)
    public String getCopyRightsYear() {
        return copyRightsYear;
    }

    public void setCopyRightsYear(String copyRightsYear) {
        this.copyRightsYear = copyRightsYear;
    }

    @Basic
    @Column(name = "FACEBOOK_LINK", nullable = true, length = 45)
    public String getFacebookLink() {
        return facebookLink;
    }

    public void setFacebookLink(String facebookLink) {
        this.facebookLink = facebookLink;
    }

    @Basic
    @Column(name = "TWITTER_LINK", nullable = true, length = 45)
    public String getTwitterLink() {
        return twitterLink;
    }

    public void setTwitterLink(String twitterLink) {
        this.twitterLink = twitterLink;
    }

    @Basic
    @Column(name = "CREATED_BY", nullable = true, length = 45)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "CREATED_ON", nullable = true)
    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    @Basic
    @Column(name = "LAST_MODIFIED_BY", nullable = true, length = 45)
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @Basic
    @Column(name = "LAST_MODIFIED_ON", nullable = true)
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
        Client client = (Client) o;
        return clientId == client.clientId &&
                Objects.equals(clientName, client.clientName) &&
                Objects.equals(websiteName, client.websiteName) &&
                Objects.equals(street, client.street) &&
                Objects.equals(city, client.city) &&
                Objects.equals(country, client.country) &&
                Objects.equals(phoneNo, client.phoneNo) &&
                Objects.equals(emailId, client.emailId) &&
                Objects.equals(copyRightsYear, client.copyRightsYear) &&
                Objects.equals(facebookLink, client.facebookLink) &&
                Objects.equals(twitterLink, client.twitterLink) &&
                Objects.equals(createdBy, client.createdBy) &&
                Objects.equals(createdOn, client.createdOn) &&
                Objects.equals(lastModifiedBy, client.lastModifiedBy) &&
                Objects.equals(lastModifiedOn, client.lastModifiedOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, clientName, websiteName, street, city, country, phoneNo, emailId, copyRightsYear, facebookLink, twitterLink, createdBy, createdOn, lastModifiedBy, lastModifiedOn);
    }
}
