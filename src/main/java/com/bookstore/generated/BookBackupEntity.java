package com.bookstore.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by james on 30/04/14.
 */
@Entity
@Table(name = "book_backup", schema = "public", catalog = "booktown")
public class BookBackupEntity {
    private Integer id;
    private String title;
    private Integer authorId;
    private Integer subjectId;

    @Basic
    @Column(name = "id", nullable = true, insertable = true, updatable = true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "author_id", nullable = true, insertable = true, updatable = true)
    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    @Basic
    @Column(name = "subject_id", nullable = true, insertable = true, updatable = true)
    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookBackupEntity that = (BookBackupEntity) o;

        if (authorId != null ? !authorId.equals(that.authorId) : that.authorId != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (subjectId != null ? !subjectId.equals(that.subjectId) : that.subjectId != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (authorId != null ? authorId.hashCode() : 0);
        result = 31 * result + (subjectId != null ? subjectId.hashCode() : 0);
        return result;
    }
}
