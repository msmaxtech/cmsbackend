package org.psmax.cmsbackend.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Page {
    private int pageId;
    private String pageName;
    private Integer order;
    private String createdBy;
    private Timestamp createdOn;
    private String lastModifiedBy;
    private Timestamp lastModifiedOn;

    @Id
    @Column(name = "PAGE_ID", nullable = false)
    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    @Basic
    @Column(name = "PAGE_NAME", nullable = true, length = 45)
    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    @Basic
    @Column(name = "ORDER", nullable = true)
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
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
        Page page = (Page) o;
        return pageId == page.pageId &&
                Objects.equals(pageName, page.pageName) &&
                Objects.equals(order, page.order) &&
                Objects.equals(createdBy, page.createdBy) &&
                Objects.equals(createdOn, page.createdOn) &&
                Objects.equals(lastModifiedBy, page.lastModifiedBy) &&
                Objects.equals(lastModifiedOn, page.lastModifiedOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageId, pageName, order, createdBy, createdOn, lastModifiedBy, lastModifiedOn);
    }
}