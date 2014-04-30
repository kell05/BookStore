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
@Table(name = "numeric_values", schema = "public", catalog = "booktown")
public class NumericValuesEntity {
    private BigDecimal num;

    @Basic
    @Column(name = "num", nullable = true, insertable = true, updatable = true, precision = 6)
    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NumericValuesEntity that = (NumericValuesEntity) o;

        if (num != null ? !num.equals(that.num) : that.num != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return num != null ? num.hashCode() : 0;
    }
}
