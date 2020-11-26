DROP DATABASE IF EXISTS simpleCRMdb;

CREATE DATABASE simpleCRMdb;

USE simpleCRMdb;

CREATE TABLE employee (
    id          INT AUTO_INCREMENT,
    firstName   VARCHAR(25) NOT NULL,
    lastName    VARCHAR(25) NOT NULL,
    phoneNumber VARCHAR(15) NOT NULL,
    address     VARCHAR(100) NOT NULL,
    CONSTRAINT pk_employee PRIMARY KEY (id)
);

CREATE TABLE contact (
    id          INT AUTO_INCREMENT,
    firstName   VARCHAR(25) NOT NULL,
    lastName    VARCHAR(25) NOT NULL,
    phoneNumber VARCHAR(15) NOT NULL,
    address     VARCHAR(100) NOT NULL,
    CONSTRAINT pk_contact PRIMARY KEY (id)
);

CREATE TABLE interaction (
    id          INT AUTO_INCREMENT,
    employeeID  INT NOT NULL,
    contactID   INT NOT NULL,
    description VARCHAR(200),
    CONSTRAINT pk_interaction PRIMARY KEY (id),
    CONSTRAINT fk_interaction_employee FOREIGN KEY (employeeID) REFERENCES employee (id),
    CONSTRAINT fk_interaction_contact FOREIGN KEY (contactID) REFERENCES contact (id)
);

CREATE TABLE note (
    id          INT AUTO_INCREMENT,
    employeeID  INT NOT NULL,
    contactID   INT NOT NULL,
    content VARCHAR(1000),
    CONSTRAINT pk_interaction PRIMARY KEY (id),
    CONSTRAINT fk_note_employee FOREIGN KEY (employeeID) REFERENCES employee (id),
    CONSTRAINT fk_note_contact FOREIGN KEY (contactID) REFERENCES contact (id)
);