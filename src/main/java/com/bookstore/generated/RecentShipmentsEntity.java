package com.bookstore.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by james on 30/04/14.
 */
@Entity
@Table(name = "recent_shipments", schema = "public", catalog = "booktown")
public class RecentShipmentsEntity {
    private Long numShipped;
    private Timestamp max;
    private String title;

    @Basic
    @Column(name = "num_shipped", nullable = true, insertable = true, updatable = true)
    public Long getNumShipped() {
        return numShipped;
    }

    public void setNumShipped(Long numShipped) {
        this.numShipped = numShipped;
    }

    @Basic
    @Column(name = "max", nullable = true, insertable = true, updatable = true)
    public Timestamp getMax() {
        return max;
    }

    public void setMax(Timestamp max) {
        this.max = max;
    }

    @Basic
    @Column(name = "title", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RecentShipmentsEntity that = (RecentShipmentsEntity) o;

        if (max != null ? !max.equals(that.max) : that.max != null) return false;
        if (numShipped != null ? !numShipped.equals(that.numShipped) : that.numShipped != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numShipped != null ? numShipped.hashCode() : 0;
        result = 31 * result + (max != null ? max.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }
}
