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
@Table(name = "shipments", schema = "public", catalog = "booktown")
public class ShipmentsEntity {
    private int id;
    private Integer customerId;
    private String isbn;
    private Timestamp shipDate;

    @Basic
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "customer_id", nullable = true, insertable = true, updatable = true)
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "isbn", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "ship_date", nullable = true, insertable = true, updatable = true)
    public Timestamp getShipDate() {
        return shipDate;
    }

    public void setShipDate(Timestamp shipDate) {
        this.shipDate = shipDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShipmentsEntity that = (ShipmentsEntity) o;

        if (id != that.id) return false;
        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;
        if (isbn != null ? !isbn.equals(that.isbn) : that.isbn != null) return false;
        if (shipDate != null ? !shipDate.equals(that.shipDate) : that.shipDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        result = 31 * result + (shipDate != null ? shipDate.hashCode() : 0);
        return result;
    }
}
