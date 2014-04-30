package com.bookstore.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created by james on 30/04/14.
 */
@Entity
@Table(name = "money_example", schema = "public", catalog = "booktown")
public class MoneyExampleEntity {
    private Double moneyCash;
    private BigDecimal numericCash;

    @Basic
    @Column(name = "money_cash", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getMoneyCash() {
        return moneyCash;
    }

    public void setMoneyCash(Double moneyCash) {
        this.moneyCash = moneyCash;
    }

    @Basic
    @Column(name = "numeric_cash", nullable = true, insertable = true, updatable = true, precision = 2)
    public BigDecimal getNumericCash() {
        return numericCash;
    }

    public void setNumericCash(BigDecimal numericCash) {
        this.numericCash = numericCash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MoneyExampleEntity that = (MoneyExampleEntity) o;

        if (moneyCash != null ? !moneyCash.equals(that.moneyCash) : that.moneyCash != null) return false;
        if (numericCash != null ? !numericCash.equals(that.numericCash) : that.numericCash != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = moneyCash != null ? moneyCash.hashCode() : 0;
        result = 31 * result + (numericCash != null ? numericCash.hashCode() : 0);
        return result;
    }
}
