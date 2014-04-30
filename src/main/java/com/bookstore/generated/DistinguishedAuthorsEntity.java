package com.bookstore.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by james on 30/04/14.
 */
@Entity
@Table(name = "distinguished_authors", schema = "public", catalog = "booktown")
public class DistinguishedAuthorsEntity {
    private int id;
    private String lastName;
    private String firstName;
    private String award;

    @Basic
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "last_name", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "first_name", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "award", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DistinguishedAuthorsEntity that = (DistinguishedAuthorsEntity) o;

        if (id != that.id) return false;
        if (award != null ? !award.equals(that.award) : that.award != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (award != null ? award.hashCode() : 0);
        return result;
    }
}
