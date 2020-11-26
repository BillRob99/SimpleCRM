package com.billrob.SimpleCRM.dao;

import com.billrob.SimpleCRM.entity.Contact;

/**
 * Interface for storing, retrieving and manipulating Contact Data.
 */
public interface ContactDao {

    /**
     * Adds a contact to the database and assigns an ID.
     * @param contact Contact to be added to the database.
     * @return Contact added, with an ID assigned.
     */
    Contact addContact(Contact contact);

    /**
     * Retrieves a Contact from the database.
     * @param id ID of the Contact to be retrieved.
     * @return Contact found with the ID provided.
     */
    Contact getContact(int id);

    /**
     * Edits a contacts information stored in the database.
     * @param Contact Contact to be updated.
     * @return Contact that has been updated.
     */
    Contact editContact(Contact Contact);

    /**
     * Deletes the contact with the ID provided.
     * @param id ID of the contact to be deleted.
     * @return Contact that has been deleted.
     */
    Contact deleteContact(int id);
}