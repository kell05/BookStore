package com.bookstore.generated;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by james on 30/04/14.
 */
@Entity
@Table(name = "editions", schema = "public", catalog = "booktown")
public class EditionsEntity {
    private String isbn;
    private Integer bookId;
    private Integer edition;
    private Integer publisherId;
    private Date publication;
    private String type;

    @Id
    @Column(name = "isbn", nullable = false, insertable = true, updatable = true, length = 2147483647)
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "book_id", nullable = true, insertable = true, updatable = true)
    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    @Basic
    @Column(name = "edition", nullable = true, insertable = true, updatable = true)
    public Integer getEdition() {
        return edition;
    }

    public void setEdition(Integer edition) {
        this.edition = edition;
    }

    @Basic
    @Column(name = "publisher_id", nullable = true, insertable = true, updatable = true)
    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    @Basic
    @Column(name = "publication", nullable = true, insertable = true, updatable = true)
    public Date getPublication() {
        return publication;
    }

    public void setPublication(Date publication) {
        this.publication = publication;
    }

    @Basic
    @Column(name = "type", nullable = true, insertable = true, updatable = true, length = 1)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EditionsEntity that = (EditionsEntity) o;

        if (bookId != null ? !bookId.equals(that.bookId) : that.bookId != null) return false;
        if (edition != null ? !edition.equals(that.edition) : that.edition != null) return false;
        if (isbn != null ? !isbn.equals(that.isbn) : that.isbn != null) return false;
        if (publication != null ? !publication.equals(that.publication) : that.publication != null) return false;
        if (publisherId != null ? !publisherId.equals(that.publisherId) : that.publisherId != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = isbn != null ? isbn.hashCode() : 0;
        result = 31 * result + (bookId != null ? bookId.hashCode() : 0);
        result = 31 * result + (edition != null ? edition.hashCode() : 0);
        result = 31 * result + (publisherId != null ? publisherId.hashCode() : 0);
        result = 31 * result + (publication != null ? publication.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
