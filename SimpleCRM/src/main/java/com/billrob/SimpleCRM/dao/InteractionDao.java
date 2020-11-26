package com.billrob.SimpleCRM.dao;

import com.billrob.SimpleCRM.entity.Interaction;

import java.util.List;

/**
 * Interface for storing, retrieving and manipulating Interaction Data.
 */
public interface InteractionDao {

    /**
     * Adds an interaction to the database and assigns an ID.
     * @param interaction Interaction to be added.
     * @return Interaction added with ID assigned.
     */
    Interaction addInteraction(Interaction interaction);

    /**
     * Edits an interaction stored on the database.
     * @param interaction Interaction to be updated.
     * @return Interaction that has been updated.
     */
    Interaction editInteraction(Interaction interaction);

    /**
     * Retrieves an interaction from the database with the ID provided.
     * @param id ID of the interaction to be retrieved.
     * @return Interaction found with the ID provided.
     */
    Interaction getInteraction(int id);

    /**
     * Deletes an interaction from the database.
     * @param id ID of the interaction to be deleted.
     * @return Interaction that has been deleted.
     */
    Interaction deleteInteraction(int id);

    /**
     * Returns a list of interactions with the Contact provided.
     * @param contactId ID of the contact.
     * @return List of interactions found with the Contact.
     */
    List<Interaction> getInteractionsForContact(int contactId);

    /**
     * Returns a list of interactions with the Employee provided.
     * @param employeeId ID of the Employee.
     * @return List of interactions found with the Employee.
     */
    List<Interaction> getInteractionsForEmployee(int employeeId);

}
