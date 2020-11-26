package com.billrob.SimpleCRM.dao;

import com.billrob.SimpleCRM.entity.Employee;

/**
 * Interface for storing, retrieving and manipulating Employee Data.
 */
public interface EmployeeDao {

    /**
     * Adds an employee to the database and assigns an ID.
     * @param employee Employee to be added to the database.
     * @return Employee that has been added to the database, with the ID assigned.
     */
    Employee addEmployee(Employee employee);

    /**
     * Retrieves the Employee with the ID provided.
     * @param id ID of the Employee to retrieve.
     * @return Employee with the ID provided.
     */
    Employee getEmployee(int id);

    /**
     * Edits Employee information stored.
     * @param employee Employee to be updated.
     * @return Employee that has been updated.
     */
    Employee editEmployee(Employee employee);

    /**
     * Deletes the employee from the database with the ID provided.
     * @param id ID of the employee to be deleted.
     * @return Employee that has been deleted.
     */
    Employee deleteEmployee(int id);
}
