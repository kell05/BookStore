package com.bookstore.generated;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by james on 30/04/14.
 */
@Entity
@Table(name = "stock", schema = "public", catalog = "booktown")
public class StockEntity {
    private String isbn;
    private BigDecimal cost;
    private BigDecimal retail;
    private Integer stock;

    @Id
    @Column(name = "isbn", nullable = false, insertable = true, updatable = true, length = 2147483647)
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "cost", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Basic
    @Column(name = "retail", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getRetail() {
        return retail;
    }

    public void setRetail(BigDecimal retail) {
        this.retail = retail;
    }

    @Basic
    @Column(name = "stock", nullable = true, insertable = true, updatable = true)
    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StockEntity that = (StockEntity) o;

        if (cost != null ? !cost.equals(that.cost) : that.cost != null) return false;
        if (isbn != null ? !isbn.equals(that.isbn) : that.isbn != null) return false;
        if (retail != null ? !retail.equals(that.retail) : that.retail != null) return false;
        if (stock != null ? !stock.equals(that.stock) : that.stock != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = isbn != null ? isbn.hashCode() : 0;
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        result = 31 * result + (retail != null ? retail.hashCode() : 0);
        result = 31 * result + (stock != null ? stock.hashCode() : 0);
        return result;
    }
}
