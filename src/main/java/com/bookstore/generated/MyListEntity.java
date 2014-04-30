package com.bookstore.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by james on 30/04/14.
 */
@Entity
@Table(name = "my_list", schema = "public", catalog = "booktown")
public class MyListEntity {
    private String todos;

    @Basic
    @Column(name = "todos", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getTodos() {
        return todos;
    }

    public void setTodos(String todos) {
        this.todos = todos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyListEntity that = (MyListEntity) o;

        if (todos != null ? !todos.equals(that.todos) : that.todos != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return todos != null ? todos.hashCode() : 0;
    }
}
