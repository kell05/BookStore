package com.bookstore.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by james on 30/04/14.
 */
@Entity
@Table(name = "daily_inventory", schema = "public", catalog = "booktown")
public class DailyInventoryEntity {
    private String isbn;
    private Boolean isStocked;

    @Basic
    @Column(name = "isbn", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "is_stocked", nullable = true, insertable = true, updatable = true)
    public Boolean getIsStocked() {
        return isStocked;
    }

    public void setIsStocked(Boolean isStocked) {
        this.isStocked = isStocked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DailyInventoryEntity that = (DailyInventoryEntity) o;

        if (isStocked != null ? !isStocked.equals(that.isStocked) : that.isStocked != null) return false;
        if (isbn != null ? !isbn.equals(that.isbn) : that.isbn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = isbn != null ? isbn.hashCode() : 0;
        result = 31 * result + (isStocked != null ? isStocked.hashCode() : 0);
        return result;
    }
}
