package com.bookstore.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by james on 30/04/14.
 */
@Entity
@Table(name = "text_sorting", schema = "public", catalog = "booktown")
public class TextSortingEntity {
    private String letter;

    @Basic
    @Column(name = "letter", nullable = true, insertable = true, updatable = true, length = 1)
    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TextSortingEntity that = (TextSortingEntity) o;

        if (letter != null ? !letter.equals(that.letter) : that.letter != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return letter != null ? letter.hashCode() : 0;
    }
}
