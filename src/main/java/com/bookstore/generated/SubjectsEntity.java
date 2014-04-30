package com.bookstore.generated;

import javax.persistence.*;

/**
 * Created by james on 30/04/14.
 */
@Entity
@Table(name = "subjects", schema = "public", catalog = "booktown")
public class SubjectsEntity {
    private int id;
    private String subject;
    private String location;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "subject", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "location", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubjectsEntity that = (SubjectsEntity) o;

        if (id != that.id) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (subject != null ? !subject.equals(that.subject) : that.subject != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }
}
