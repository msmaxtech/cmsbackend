package org.psmax.cmsbackend.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Content {
    private int contentId;
    private Integer pageId;
    private String contentHeader;
    private String contentTitile;
    private String description;
    private String createdBy;
    private Timestamp createdOn;
    private String lastModifiedBy;
    private Timestamp lastModifiedOn;

    @Id
    @Column(name = "CONTENT_ID", nullable = false)
    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    @Basic
    @Column(name = "PAGE_ID", nullable = true)
    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    @Basic
    @Column(name = "CONTENT_HEADER", nullable = true, length = 45)
    public String getContentHeader() {
        return contentHeader;
    }

    public void setContentHeader(String contentHeader) {
        this.contentHeader = contentHeader;
    }

    @Basic
    @Column(name = "CONTENT_TITILE", nullable = true, length = 45)
    public String getContentTitile() {
        return contentTitile;
    }

    public void setContentTitile(String contentTitile) {
        this.contentTitile = contentTitile;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 300)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        Content content = (Content) o;
        return contentId == content.contentId &&
                Objects.equals(pageId, content.pageId) &&
                Objects.equals(contentHeader, content.contentHeader) &&
                Objects.equals(contentTitile, content.contentTitile) &&
                Objects.equals(description, content.description) &&
                Objects.equals(createdBy, content.createdBy) &&
                Objects.equals(createdOn, content.createdOn) &&
                Objects.equals(lastModifiedBy, content.lastModifiedBy) &&
                Objects.equals(lastModifiedOn, content.lastModifiedOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentId, pageId, contentHeader, contentTitile, description, createdBy, createdOn, lastModifiedBy, lastModifiedOn);
    }
}
