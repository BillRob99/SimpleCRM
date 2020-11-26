package com.billrob.SimpleCRM.dao;

import com.billrob.SimpleCRM.entity.Interaction;
import com.billrob.SimpleCRM.entity.Note;

import java.util.List;

/**
 * Interface for storing, retrieving and manipulating Note Data.
 */
public interface NoteDao {

    /**
     * Adds a Note to the database and assigns an ID.
     * @param note Note to be added to the database.
     * @return Note added with ID assigned.
     */
    Note addNote(Note note);

    /**
     * Edits a note stored on the database.
     * @param note Note to be updated.
     * @return Note that has been updated.
     */
    Note editNote(Note note);

    /**
     * Returns a note from the database with the ID provided.
     * @param id ID of the Note to be found.
     * @return Note found with the ID provided.
     */
    Note getNote(int id);

    /**
     * Deletes a note from the database with the ID provided.
     * @param id ID of the note that is to be deleted.
     * @return Returns the Note that has been deleted.
     */
    Note deleteNote(int id);

    /**
     * Returns a list of notes from the database associated with the contact provided.
     * @param contactId ID of the contact.
     * @return List of Notes associated with the Contact.
     */
    List<Note> getNotesForContact(int contactId);

    /**
     * Returns a list of notes from the database associated with the Employee provided.
     * @param employeeId ID of the Employee.
     * @return List of Notes associated with the Employee.
     */
    List<Note> getNotesForEmployee(int employeeId);
}
