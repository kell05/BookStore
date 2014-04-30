package com.bookstore.generated;

import javax.persistence.*;

/**
 * Created by james on 30/04/14.
 */
@Entity
@Table(name = "schedules", schema = "public", catalog = "booktown")
public class SchedulesEntity {
    private int employeeId;
    private String schedule;

    @Id
    @Column(name = "employee_id", nullable = false, insertable = true, updatable = true)
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "schedule", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SchedulesEntity that = (SchedulesEntity) o;

        if (employeeId != that.employeeId) return false;
        if (schedule != null ? !schedule.equals(that.schedule) : that.schedule != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + (schedule != null ? schedule.hashCode() : 0);
        return result;
    }
}
