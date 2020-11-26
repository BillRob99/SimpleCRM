package com.billrob.SimpleCRM.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Note {
    private int id;
    private Employee employee;
    private Contact contact;
    private LocalDateTime dateTime;
    private String content;

    public Note(Employee employee, Contact contact, LocalDateTime dateTime, String content) {
        this.employee = employee;
        this.contact = contact;
        this.dateTime = dateTime;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return id == note.id &&
                employee.equals(note.employee) &&
                contact.equals(note.contact) &&
                dateTime.equals(note.dateTime) &&
                content.equals(note.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employee, contact, dateTime, content);
    }
}
