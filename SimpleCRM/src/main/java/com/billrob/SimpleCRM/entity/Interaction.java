package com.billrob.SimpleCRM.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Interaction {
    private int id;
    private Employee employee;
    private Contact contact;
    private LocalDateTime dateTime;
    private String description;

    public Interaction(Employee employee, Contact contact, LocalDateTime dateTime, String description) {
        this.employee = employee;
        this.contact = contact;
        this.dateTime = dateTime;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interaction that = (Interaction) o;
        return id == that.id &&
                employee.equals(that.employee) &&
                contact.equals(that.contact) &&
                dateTime.equals(that.dateTime) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employee, contact, dateTime, description);
    }
}
